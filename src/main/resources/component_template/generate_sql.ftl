//保存
INSERT INTO ${tableName} SET
<#list dataList as setDate>
    ${setDate.key} = ${setDate.value} ,
</#list>