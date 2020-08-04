public class FamilyAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "收支\t账户金额\t收支金额\t说明\n";
		int balance = 10000;//初始金额
		do{
			System.out.println("-----------------家庭收支记账软件-----------------\n");
			System.out.println("                  1 收支明细");
			System.out.println("                  2 登记收入");
			System.out.println("                  3 登记支出");
			System.out.println("                  4 退    出\n");
			System.out.print("                  请选择(1-4)：");
			char key = Utility.readMenuSelection();//用户输入1-4进行选择
			System.out.println();
			switch(key){
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("本次收入金额：");
					int amount = Utility.readNumber();//从键盘获取收入的金额
					System.out.print("收入说明：");
					String desc = Utility.readString();//从键盘获取收入说明
					
					//根据获取的收入金额更改用户的收入信息
					balance += amount;
					details += ("收支\t"+balance+"\t\t"+amount+"\t\t"+desc+"\t\n");
					System.out.println("---------------------登记完成-------------------");
					break;
				case '3':
					//System.out.print("支出");
					System.out.print("本次支出金额：");
					int amount1 = Utility.readNumber();//从键盘获取支出的金额
					System.out.print("本次支出说明：");
					String desc1 = Utility.readString();//从键盘获取支出的说明
					//判断余额是否满足条件
					if(balance > amount1){
						balance -= amount1;
						details += ("支出\t" + balance + "\t\t" + amount1 + "\t\t" +desc1 + "\n");
					}else{
						System.out.println("您的余额不足！");
					}
					break;
				case '4':
					System.out.print("确认是否退出（Y/N）:");
					char exit = Utility.readConfirmSelection();
					if(exit == 'Y'){
						isFlag = false;
					}
					break;
					
			}
			
		}while(isFlag);
	}
}