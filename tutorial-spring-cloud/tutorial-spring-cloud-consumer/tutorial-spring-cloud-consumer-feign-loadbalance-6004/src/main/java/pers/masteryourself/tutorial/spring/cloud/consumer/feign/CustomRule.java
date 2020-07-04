package pers.masteryourself.tutorial.spring.cloud.consumer.feign;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * <p>description : CustomRule
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/4 16:16
 */
public class CustomRule extends AbstractLoadBalancerRule {

    @Value("${ribbon.exclude.ips:}")
    private String excludeIps;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        // 获取到所有可用的 servers
        List<Server> reachableServers = super.getLoadBalancer().getReachableServers();
        if (reachableServers.size() == 1) {
            return reachableServers.get(0);
        }
        // 排除指定 ip
        List<Server> availableServers = this.excludeIp(reachableServers);
        if (availableServers.size() == 0) {
            return reachableServers.get(new Random().nextInt(reachableServers.size()));
        }
        // 随机抽取一个 server
        return availableServers.get(new Random().nextInt(availableServers.size()));
    }

    private List<Server> excludeIp(List<Server> reachableServers) {
        return reachableServers.stream()
                .filter(server -> !(excludeIps.contains(server.getHost() + ":" + server.getPort())))
                .collect(Collectors.toList());
    }

}
