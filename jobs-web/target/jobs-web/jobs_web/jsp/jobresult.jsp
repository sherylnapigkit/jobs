<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ include file="include.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8">
    <script src="${contextPath}/jobs_web/js/search.js"></script>
    <link href="${contextPath}/jobs_web/css/jobs.css" rel="stylesheet" type="text/css">
	<title>Job Results</title>
</head>
<body class="container" style="width: 60%">
        <form:form id="jobSearchForm" modelAttribute="jobSearchRequest" action="searchJobs">
            
            <div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 colxs-12">
					<div class="wrapper">
						<c:forEach items="${jobSearchResult.jobs}" var="job" varStatus="ctr">
						<div class="panel panel-primary">
						  <div class="panel-heading">
						    <h3 class="panel-title">${job.companyLongName} : ${job.name}</h3>
						  </div>
						  <div class="panel-body">
						    	${job.locations}	
						    	Published: ${job.publicationDate}
						    	${job.locations}		
						  </div>
						</div>
						</c:forEach>
            		</div>
            	</div>
            </div>

            <div align="center">
				<button class="btn btn-success" type="submit">Search jobs</button>
			</div>
			
        </form:form>
</body>
</html>