package com.hy.common;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by huyu on 2017/12/22
 * Description: json信息无损储存
 * 实现方法： 结构化树形结构保存
 */
public class Configuration {
    /**
     * 对于加密的key,需要记录下来
     * 为的是后面分布式的情况将将该值加密后*/
    private Set<String> secretKeyPathSet = new HashSet<String>(); 
}
