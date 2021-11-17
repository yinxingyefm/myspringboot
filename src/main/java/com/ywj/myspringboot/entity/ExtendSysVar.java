package com.ywj.myspringboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ywj
 * @since 2021-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ExtendSysVar implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 扩展系统变量ID
     */
    @TableId("ID")
    private String id;

    /**
     * 扩展系统变量名称
     */
    private String name;

    /**
     * 扩展系统变量值
     */
    private String value;

    /**
     * 是否加密(1加密，0不加密)
     */
    private String encrypt;


}
