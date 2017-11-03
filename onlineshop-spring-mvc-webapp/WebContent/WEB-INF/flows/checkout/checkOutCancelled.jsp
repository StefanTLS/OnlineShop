
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="bg-info">
                <div class="container">
                    <h1 class="alert alert-danger">Checkout cancelled</h1>

                    <p>Checkout process is cancelled. You can keep shopping.</p>
                </div>
            </div>
        </section>

        <section class="container">
            <p>
                <a href="<spring:url value="/product/productList" />" class="btn btn-default">Products</a>
            </p>
        </section>

   

<%@include file="/WEB-INF/views/template/footer.jsp" %>