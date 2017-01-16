<#-- 这是Freemarker注释 -->
<#-- 获取简单值 -->
<#-- ${table}-->

<#-- List使用 -->
<#--
<#list table as t>
序号：${t_index}   表名：${t.NAME}
</#list>
-->

<#-- List嵌套List的使用 -->
<#list table as t>
序号：${t_index}   表名：${t.NAME}
    <#list t.COLUMNS as c>
    序号：${c_index}   列名：${c.NAME}
    </#list>
</#list>
