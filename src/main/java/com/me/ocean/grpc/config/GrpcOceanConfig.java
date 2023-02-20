package com.me.ocean.grpc.config;

import io.bbex.base.grpc.client.channel.IGrpcClientPool;
import io.bbex.broker.grpc.admin.TbOceanServiceGrpc;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


@Slf4j
@Component
public class GrpcOceanConfig {

    public static final String TB_OCEAN_CHANNEL_NAME = "tb-ocean";

    long stubDeadline;

    @Resource
    private IGrpcClientPool pool;



    public TbOceanServiceGrpc.TbOceanServiceBlockingStub tbOceanServiceBlockingStub() {
        Channel channel = pool.borrowChannel(TB_OCEAN_CHANNEL_NAME);
        return TbOceanServiceGrpc.newBlockingStub(channel).withDeadlineAfter(stubDeadline, TimeUnit.MILLISECONDS);
    }

}
