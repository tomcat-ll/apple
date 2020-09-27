package test.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class test {
    @ApiModelProperty
    private Integer id;

    @ApiModelProperty(value = "人员Id")
    private Integer personId;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "在线状态")
    private String onlineStatus;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "所属单位")
    private String subordinateUnit;

    @ApiModelProperty(value = "部门")
    private String department;

    @ApiModelProperty(value = "上线位置")
    private String onlinePosition;

    @ApiModelProperty(value = "下线位置")
    private String offlinePosition;

    @ApiModelProperty(value = "上线时间")
    private Date onlineTime;

    @ApiModelProperty(value = "下线时间")
    private Date offlineTime;


}
