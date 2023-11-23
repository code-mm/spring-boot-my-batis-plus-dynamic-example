package com.my.app.mysql.ms_b.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.my.app.mysql.ms_b.entity.MTestB;
import com.my.app.mysql.ms_b.mapper.MTestBMapper;
import com.my.app.mysql.ms_b.service.IMTestBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ms
 * @since 2023-11-23
 */
@Service
@DS("ms_b")
public class MTestBServiceImpl extends ServiceImpl<MTestBMapper, MTestB> implements IMTestBService {

}
