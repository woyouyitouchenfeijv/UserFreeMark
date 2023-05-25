package com.apps.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author
 */
public class PeopleVo {
    /**
     * 工作项数
     */
    private int workItemNum;
    /**
     * 责任人姓名
     */
    private String operatorName;
    /**
     * 责任人id
     */
    private String operatorId;
    /**
     * 登记时长
     */
    private BigDecimal costTime;
    /**
     * 展开标志
     */
    private Boolean show;
    /**
     * 预估工时
     */
    private BigDecimal estimateTime;
    /**
     * 工作项集合
     */
    private List<WorkItemInfo> wList;

    public int getWorkItemNum() {
        return workItemNum;
    }

    public void setWorkItemNum(int workItemNum) {
        this.workItemNum = workItemNum;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public List<WorkItemInfo> getwList() {
        return wList;
    }

    public void setwList(List<WorkItemInfo> wList) {
        this.wList = wList;
    }

    public BigDecimal getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(BigDecimal estimateTime) {
        this.estimateTime = estimateTime;
    }



}
