<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Banking Application</title>
 
<script>
 
function showForm(formId){
 
document.getElementById("addForm").style.display="none";
document.getElementById("depositForm").style.display="none";
document.getElementById("withdrawForm").style.display="none";
document.getElementById("searchForm").style.display="none";
document.getElementById("searchByNameForm").style.display="none";
document.getElementById("updateForm").style.display="none";
document.getElementById("deleteForm").style.display="none";
 
document.getElementById(formId).style.display="block";
 
}
 
</script>
 
</head>
 
<body>
 
<h2>Banking Application</h2>
 
<!-- MENU -->
 
<button onclick="showForm('addForm')">Add Account</button>
 
<button onclick="showForm('depositForm')">Deposit</button>
 
<button onclick="showForm('withdrawForm')">Withdraw</button>
 
<button onclick="showForm('searchForm')">Search By Account No</button>
 
<button onclick="showForm('searchByNameForm')">Search By Name</button>
 
<button onclick="showForm('updateForm')">Update Account</button>
 
<button onclick="showForm('deleteForm')">Delete Account</button>
 
<br><br>
 
<a href="<%=request.getContextPath()%>/ViewAccountsServlet">View All Accounts</a>
 
<hr>
 
 
<!-- ADD ACCOUNT -->
 
<div id="addForm" style="display:none;">
 
<h3>Add Account</h3>
 
<form method="post" action="<%=request.getContextPath()%>/AddAccountServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
Account Holder Name:
<input type="text" name="accHolderName"><br><br>
 
Account Type:
<input type="text" name="accType"><br><br>
 
Balance:
<input type="text" name="balance"><br><br>
 
<input type="submit" value="Add Account">
 
</form>
 
</div>
 
 
<!-- DEPOSIT -->
 
<div id="depositForm" style="display:none;">
 
<h3>Deposit Amount</h3>
 
<form method="post" action="<%=request.getContextPath()%>/DepositServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
Amount:
<input type="text" name="amount"><br><br>
 
<input type="submit" value="Deposit">
 
</form>
 
</div>
 
 
<!-- WITHDRAW -->
 
<div id="withdrawForm" style="display:none;">
 
<h3>Withdraw Amount</h3>
 
<form method="post" action="<%=request.getContextPath()%>/WithdrawServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
Amount:
<input type="text" name="amount"><br><br>
 
<input type="submit" value="Withdraw">
 
</form>
 
</div>
 
 
<!-- SEARCH ACCOUNT -->
 
<div id="searchForm" style="display:none;">
 
<h3>Search Account</h3>
 
<form method="post" action="<%=request.getContextPath()%>/SearchAccountServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
<input type="submit" value="Search">
 
</form>
 
</div>
 
 
<!-- SEARCH BY NAME -->
 
<div id="searchByNameForm" style="display:none;">
 
<h3>Search By Name</h3>
 
<form method="post" action="<%=request.getContextPath()%>/SearchByNameServlet">
 
Account Holder Name:
<input type="text" name="accHolderName"><br><br>
 
<input type="submit" value="Search">
 
</form>
 
</div>
 
 
<!-- UPDATE ACCOUNT -->
 
<div id="updateForm" style="display:none;">
 
<h3>Update Account</h3>
 
<form method="post" action="<%=request.getContextPath()%>/UpdateAccountServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
New Holder Name:
<input type="text" name="accHolderName"><br><br>
 
New Account Type:
<input type="text" name="accType"><br><br>
 
New Balance:
<input type="text" name="balance"><br><br>
 
<input type="submit" value="Update Account">
 
</form>
 
</div>
 
 
<!-- DELETE ACCOUNT -->
 
<div id="deleteForm" style="display:none;">
 
<h3>Delete Account</h3>
 
<form method="post" action="<%=request.getContextPath()%>/DeleteAccountServlet">
 
Account Number:
<input type="text" name="accNo"><br><br>
 
<input type="submit" value="Delete Account">
 
</form>
 
</div>
 
</body>
</html>
 