document.querySelector('#find').addEventListener('click', function(event){

    event.preventDefault();
var  loan = document.getElementById('amount').value;
var interestRate = document.getElementById('ir').value;
var time = document.getElementById('time').value;

var noOfMonths = time*12;
var monthlyRate = interestRate/(12*100);
var onePlusR = Math.pow(1+monthlyRate, noOfMonths);
var denominator = onePlusR-1;
var emi = (loan*monthlyRate*(onePlusR/denominator)).toPrecision(5);
var totalAmt = noOfMonths*parseFloat(emi);
var totalAmt = noOfMonths*parseFloat(emi);
var totalInt = Math.floor(totalAmt - loan);

var payableEMI = document.querySelector('.emi');
var payableamount = document.querySelector('.totalAmount');
var payableInt = document.querySelector('.totalInt');

payableEMI.innerHTML = parseFloat(emi);
payableamount.innerHTML = parseFloat(totalAmt);
payableInt.innerHTML = parseFloat(totalInt);
});