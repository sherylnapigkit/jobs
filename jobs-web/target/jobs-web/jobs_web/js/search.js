$(document).ready(function() {
	
	$('a[id*=lnk-]').click(function() {
		
		var div = "#" + $(this).attr('id').replace(/lnk/i, "div");
		if ($(this).text() == 'Show') {
			$(this).html('Hide');
			$(div).css('display', 'block');
			
		} else {
			$(this).html('Show');
			$(div).css('display', 'none');
			
		}
	});
	
	//processRequest();
});

function processRequest() {
	var $form = $('#jobSearchForm');
	
	$form.bind('submit', function(e) {
		// Ajax validation
		//var $inputs = $form.find(':input');
		//var data = collectFormData($inputs);

		$.post('searchJobs', function(response) {
			//$form.find('.form-group').removeClass('has-error');
			//$form.find('.help-block').empty();
			//$form.find('.alert').remove();
							
			if (response.status == 'FAIL') {
				/*for (var i = 0; i < response.errorMessageList.length; i++) {
					var item = response.errorMessageList[i];
					var $controlGroup = $('#' + item.fieldName);
					$controlGroup.addClass('has-error');
					$controlGroup.find('.help-block').html(item.message);
				}*/
			} else {
					$form.unbind('submit');
					//if (formJsonUrl == "productpricing.json") {
					//	displayProducts(response);
					//} else {
						$form.submit();
					//}
			}
	   }, 'json');
	   e.preventDefault();
 					
	   return false;
	});	
}

/*function formSubmit(formId, formJsonUrl) {	
	var $form = $('#'+formId);
	
	$form.bind('submit', function(e) {
		// Ajax validation
		var $inputs = $form.find(':input');
		var data = collectFormData($inputs);

		$.post(formJsonUrl, data, function(response) {
			$form.find('.form-group').removeClass('has-error');
			$form.find('.help-block').empty();
			$form.find('.alert').remove();
							
			if (response.status == 'FAIL') {
				for (var i = 0; i < response.errorMessageList.length; i++) {
					var item = response.errorMessageList[i];
					var $controlGroup = $('#' + item.fieldName);
					$controlGroup.addClass('has-error');
					$controlGroup.find('.help-block').html(item.message);
				}
			} else {
					$form.unbind('submit');
					if (formJsonUrl == "productpricing.json") {
						displayProducts(response);
					} else {
						$form.submit();
					}
			}
	   }, 'json');
	   e.preventDefault();
 					
	   return false;
	});	
}*/