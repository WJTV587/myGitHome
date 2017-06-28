<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="${pageContext.request.contextPath}/bootstrap2.3.2/css/bootstrap.min.css" rel="stylesheet"/>
    <title></title>
    <link href="${pageContext.request.contextPath}/styles/Common.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/styles/Index2.css" rel="stylesheet"/>
	<script type="text/javascript">
	function openEdit(cid) {
		
	}
	</script>

</head>
<body>
<div class="container-fluid">

    <div class="row-fluid">
        <h4>数据列表</h4>

        <div>
            <form action="${pageContext.request.contextPath}/customer_findByCondition.action" id="searchFrom" method="post" target="_parent">
                <div class="uinArea" id="uinArea">
                    客户名称：
                    <input type="text" id="u" name="cust_name" value="${param.cust_name}" class="inputstyle"/>
                    客户类型：
                    <input type="text" id="p" name="cust_type" value="${param.cust_type}" class="inputstyle"/>
                	&nbsp;&nbsp;
                	<input type="image" name="submit" src="${pageContext.request.contextPath}/images/Search.png" onClick="document.searchFrom.submit()">
                </div>
            </form>
        </div>
        <div class="add"><a class="btn btn-success" href="${pageContext.request.contextPath}/customer_toAddCustomerListPage.action">新增</a></div>
        <div class="w">
            <div class="span12">
                <table class="table table-condensed table-bordered table-hover tab">
                    <thead>
                    <tr>
                        <th>客户名称</th>
                        <th>客户类型</th>
                        <th>联系电话</th>
                        <th>联系地址</th>
                        <th>所属员工</th>
                        <th>操作</th>
                    </tr>

                    </thead>
                    <tbody id="tbody">
                    <%--<tr>--%>
                    <%--<th>123</th>--%>
                    <%--<th>123</th>--%>
                    <%--<th>123</th>--%>
                    <%--<th>123</th>--%>
                    <%--<th>123</th>--%>
                    <%--<th><a href="#">修改</a><a href="#">删除</a></th>--%>
                    <%--</tr>--%>
                 	<c:forEach items="${ list }" var="customer">
                        <tr>
                            <th>${customer.cust_name }</th>
                            <th>${customer.cust_type }</th>
                            <th>${customer.cust_phone }</th>
                            <th>${customer.cust_address }</th>
                            <th>${customer.user.nickname }</th>
                            <th>
                                <!-- 显示删除和修改操作 -->
                                    <%--<a href="${pageContext.request.contextPath }/customerAction_toEdit?cid=<s:property value="cid" />">修改</a>--%>
                                <a href="${pageContext.request.contextPath }/customer_toEditCustomerPage.action?cid=${customer.cid}">修改</a>
                                &nbsp;&nbsp;
                                <a href="${pageContext.request.contextPath }/customer_deleteOneCustomer.action?cid=${customer.cid}" target="_parent">删除</a>
                            </th>
                        </tr>
             			</c:forEach>
                    </tbody>
                </table>
                <div id="page" class="tr"></div>
            </div>
        </div>
    </div>
</div>


<script src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap2.3.2/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/scripts/layer.js"></script>
<script src="${pageContext.request.contextPath}/scripts/laypage.js"></script>
<script src="${pageContext.request.contextPath}/scripts/Index2.js"></script>
</body>
</html>