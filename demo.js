var bank = /** @class */ (function () {
    function bank() {
    }
    bank.prototype.openAcc = function (opnbal) {
        this.opnbal = opnbal;
        if (this.opnbal <= 5000) {
            console.log("Opening balance should be above 5000");
        }
        else {
            this.bal = this.opnbal;
            console.log("Your Current Balance is " + this.bal);
        }
    };
    bank.prototype.withDraw = function (withamt) {
        this.withamt = withamt;
        if (this.withamt > this.bal) {
            console.log("Insufficient Balance");
        }
        else {
            this.bal = this.bal - this.withamt;
            console.log("Transaction Successfull. You Current balance is " + this.bal);
        }
    };
    bank.prototype.deposit = function (depoamt) {
        this.depoamt = depoamt;
        this.bal = this.bal + this.depoamt;
        console.log("Deposit Successful. Your current balance is " + this.bal);
    };
    return bank;
}());
var obj = new bank();
obj.openAcc(6000);
obj.withDraw(500);
obj.deposit(20000);
