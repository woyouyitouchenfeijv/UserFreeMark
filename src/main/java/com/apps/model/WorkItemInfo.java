package com.apps.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;


@SuppressWarnings("serial")
public class WorkItemInfo implements Serializable {
    /**
     * 主键
     */
    private String uuid;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务状态
     */
    private String taskState;
    /**
     * 工作项名称
     */
    private String workName;
    /**
     * 计划完成时间
     */
    private Date executeTime;
    /**
     * 第一个计划完成时间
     */
    private String firstExecuteTime;
    /**
     * 第二个计划完成时间
     */
    private String secondExecuteTime;
    /**
     * 计划完成时间
     */
    private String strExecuteTime;
    /**
     * 预估工时
     */
    private BigDecimal estimateTime;
    /**
     * 消耗工时
     */
    private BigDecimal costTime;
    /**
     * 负责人id
     */
    private String operatorId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 负责人姓名
     */
    private String operatorName;
    /**
     * 状态(0:未开始, 1:已完成)
     */
    private String state;
    /**
     * 状态集合
     */
    private List<String> workState;
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 项目id
     */
    private String projectId;
    /**
     * 项目责任人id
     */
    private String projectManagerId;
    /**
     * 完成时间
     */
    private Date completeTime;
    /**
     * 第一个完成时间
     */
    private String firstCompleteTime;
    /**
     * 第二个完成时间
     */
    private String secondCompleteTime;
    /**
     * 完成时间
     */
    private String strECmpleteTime;
    /**
     * 0:计划内/1:计划外
     */
    private String planState;
    /**
     * 0:计划内/1:计划外
     */
    private String planStateName;

    /**
     * 状态名称(0未执行, 1已完成)
     */
    private String stateName;
    /**
     * 0:计划内/1:计划外
     */
    private Integer stateIndex;

    /**
     * 状态名称(0未执行, 1已完成)
     */
    private Integer planStateIndex;

    /**
     * 工作项集合
     */
    private List<WorkItemInfo> workList;

    /**
     * 今日工作
     */
    private String todayReport;
    /**
     * 明日工作
     */
    private String tomorrowReport;
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 节点类型
     */
    private String nodeType;
    /**
     * 起始日期
     */
    private Date startTime;
    /**
     * 结束日期
     */
    private Date endTime;
    /**
     * 日期类型
     */
    private String type;
    /**
     * 选择月时输入框数据
     */
    private String mounth;
    /**
     * 选择自定义时后一个时间框
     */
    private String behindfillInTime;
    /**
     * 判断能否操作
     */
    private Boolean operate;
    /**
     * 判断跳转能否操作
     */
    private Boolean operateConfirm;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建人
     */
    private String creatorName;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 是否设置为常用工作项
     */
    private String isCommonWork;
    /**
     * 用于区分自定义工作项和常用工作项 0自定义 1常用
     */
    private String workItemType;
    /**
     * 工作项uuid集合
     */
    private List<String> ids;

    /**
     * 工作项类型id
     */
    private String workType;
    /**
     * 工作项类型名称
     */
    private String workTypeName;
    /**
     * 任务负责人
     */
    private String taskOperatorId;
    /**
     * 任务创建人
     */
    private String taskCreatorId;
    /**
     * 与我相关的选择集合
     */
    private List<String> typeList;
    /**
     * 状态集合
     */
    private List<Object> statusList;
    private BigDecimal taskEstimateTime;
    /**
     * 任务参与人
     */
    private Boolean flag;
    /**
     * 权限map
     */
    private Map<String, Object> permissionMap;

    private String projectType;

    /**
     * 审核状态
     */
    private String auditStatus;

    private List<String> auditStatuses;

    /**
     * 审核状态名称
     */
    private String auditStatusName;

    /**
     * 项目状态
     */
    private String projectState;

    /**
     * 数据权限
     */
    private Map<String, Set<String>> dataPermissions;

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    public Map<String, Set<String>> getDataPermissions() {
        return dataPermissions;
    }

    public void setDataPermissions(Map<String, Set<String>> dataPermissions) {
        this.dataPermissions = dataPermissions;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public WorkItemInfo() {}

    public String getWorkTypeName() {
        return workTypeName;
    }

    public void setWorkTypeName(String workTypeName) {
        this.workTypeName = workTypeName;
    }

    public String getStrExecuteTime() {
        return strExecuteTime;
    }

    public void setStrExecuteTime(String strExecuteTime) {
        this.strExecuteTime = strExecuteTime;
    }

    public String getStrECmpleteTime() {
        return strECmpleteTime;
    }

    public void setStrECmpleteTime(String strECmpleteTime) {
        this.strECmpleteTime = strECmpleteTime;
    }

    public String getPlanStateName() {
        return planStateName;
    }

    public void setPlanStateName(String planStateName) {
        this.planStateName = planStateName;
    }

    public String getTodayReport() {
        return todayReport;
    }

    public void setTodayReport(String todayReport) {
        this.todayReport = todayReport;
    }

    public String getTomorrowReport() {
        return tomorrowReport;
    }

    public void setTomorrowReport(String tomorrowReport) {
        this.tomorrowReport = tomorrowReport;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMounth() {
        return mounth;
    }

    public void setMounth(String mounth) {
        this.mounth = mounth;
    }

    public String getBehindfillInTime() {
        return behindfillInTime;
    }

    public void setBehindfillInTime(String behindfillInTime) {
        this.behindfillInTime = behindfillInTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<WorkItemInfo> getWorkList() {
        return workList;
    }

    public void setWorkList(List<WorkItemInfo> workList) {
        this.workList = workList;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getPlanState() {
        return planState;
    }

    public void setPlanState(String planState) {
        this.planState = planState;
    }

    public Boolean getOperate() {
        return operate;
    }

    public void setOperate(Boolean operate) {
        this.operate = operate;
    }

    public Integer getStateIndex() {
        return stateIndex;
    }

    public void setStateIndex(Integer stateIndex) {
        this.stateIndex = stateIndex;
    }

    public Integer getPlanStateIndex() {
        return planStateIndex;
    }

    public void setPlanStateIndex(Integer planStateIndex) {
        this.planStateIndex = planStateIndex;
    }

    public String getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(String projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BigDecimal getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(BigDecimal estimateTime) {
        this.estimateTime = estimateTime;
    }

    public String getWorkItemType() {
        return workItemType;
    }

    public void setWorkItemType(String workItemType) {
        this.workItemType = workItemType;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getIsCommonWork() {
        return isCommonWork;
    }

    public void setIsCommonWork(String isCommonWork) {
        this.isCommonWork = isCommonWork;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getTaskOperatorId() {
        return taskOperatorId;
    }

    public void setTaskOperatorId(String taskOperatorId) {
        this.taskOperatorId = taskOperatorId;
    }

    public List<String> getWorkState() {
        return workState;
    }

    public void setWorkState(List<String> workState) {
        this.workState = workState;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Object> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Object> statusList) {
        this.statusList = statusList;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getFirstExecuteTime() {
        return firstExecuteTime;
    }

    public void setFirstExecuteTime(String firstExecuteTime) {
        this.firstExecuteTime = firstExecuteTime;
    }

    public String getSecondExecuteTime() {
        return secondExecuteTime;
    }

    public void setSecondExecuteTime(String secondExecuteTime) {
        this.secondExecuteTime = secondExecuteTime;
    }

    public String getFirstCompleteTime() {
        return firstCompleteTime;
    }

    public void setFirstCompleteTime(String firstCompleteTime) {
        this.firstCompleteTime = firstCompleteTime;
    }

    public String getSecondCompleteTime() {
        return secondCompleteTime;
    }

    public void setSecondCompleteTime(String secondCompleteTime) {
        this.secondCompleteTime = secondCompleteTime;
    }

    public BigDecimal getTaskEstimateTime() {
        return taskEstimateTime;
    }

    public void setTaskEstimateTime(BigDecimal taskEstimateTime) {
        this.taskEstimateTime = taskEstimateTime;
    }

    public Boolean getOperateConfirm() {
        return operateConfirm;
    }

    public void setOperateConfirm(Boolean operateConfirm) {
        this.operateConfirm = operateConfirm;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public String getTaskCreatorId() {
        return taskCreatorId;
    }

    public void setTaskCreatorId(String taskCreatorId) {
        this.taskCreatorId = taskCreatorId;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Map<String, Object> getPermissionMap() {
        return permissionMap;
    }

    public void setPermissionMap(Map<String, Object> permissionMap) {
        this.permissionMap = permissionMap;
    }

    public WorkItemInfo(String uuid, String taskId, String operatorId, String projectId,
            BigDecimal costTime) {
        super();
        this.uuid = uuid;
        this.taskId = taskId;
        this.operatorId = operatorId;
        this.projectId = projectId;
        this.costTime = costTime;
    }

    public WorkItemInfo(String uuid, BigDecimal estimateTime, BigDecimal costTime,
            String operatorId) {
        super();
        this.uuid = uuid;
        this.estimateTime = estimateTime;
        this.costTime = costTime;
        this.operatorId = operatorId;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }


    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public List<String> getAuditStatuses() {
        return auditStatuses;
    }

    public void setAuditStatuses(List<String> auditStatuses) {
        this.auditStatuses = auditStatuses;
    }
}
