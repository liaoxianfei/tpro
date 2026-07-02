package com.kingtype.system.dubbo;

import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import com.kingtype.common.core.utils.MapstructUtils;
import com.kingtype.system.api.RemoteClientService;
import com.kingtype.system.api.domain.vo.RemoteClientVo;
import com.kingtype.system.domain.vo.SysClientVo;
import com.kingtype.system.service.ISysClientService;
import com.kingtype.system.domain.convert.SysClientVoConvert;
import org.springframework.stereotype.Service;

/**
 * 客户端服务
 *
 * @author Michelle.Chung
 */
@RequiredArgsConstructor
@Service
@DubboService
public class RemoteClientServiceImpl implements RemoteClientService {

    private final ISysClientService sysClientService;

    /**
     * 根据客户端id获取客户端详情
     *
     * @see SysClientVoConvert
     */
    @Override
    public RemoteClientVo queryByClientId(String clientId) {
        SysClientVo vo = sysClientService.queryByClientId(clientId);
        return MapstructUtils.convert(vo, RemoteClientVo.class);
    }

}
