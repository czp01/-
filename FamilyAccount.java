public class FamilyAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "��֧\t�˻����\t��֧���\t˵��\n";
		int balance = 10000;//��ʼ���
		do{
			System.out.println("-----------------��ͥ��֧�������-----------------\n");
			System.out.println("                  1 ��֧��ϸ");
			System.out.println("                  2 �Ǽ�����");
			System.out.println("                  3 �Ǽ�֧��");
			System.out.println("                  4 ��    ��\n");
			System.out.print("                  ��ѡ��(1-4)��");
			char key = Utility.readMenuSelection();//�û�����1-4����ѡ��
			System.out.println();
			switch(key){
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.print("���������");
					int amount = Utility.readNumber();//�Ӽ��̻�ȡ����Ľ��
					System.out.print("����˵����");
					String desc = Utility.readString();//�Ӽ��̻�ȡ����˵��
					
					//���ݻ�ȡ������������û���������Ϣ
					balance += amount;
					details += ("��֧\t"+balance+"\t\t"+amount+"\t\t"+desc+"\t\n");
					System.out.println("---------------------�Ǽ����-------------------");
					break;
				case '3':
					//System.out.print("֧��");
					System.out.print("����֧����");
					int amount1 = Utility.readNumber();//�Ӽ��̻�ȡ֧���Ľ��
					System.out.print("����֧��˵����");
					String desc1 = Utility.readString();//�Ӽ��̻�ȡ֧����˵��
					//�ж�����Ƿ���������
					if(balance > amount1){
						balance -= amount1;
						details += ("֧��\t" + balance + "\t\t" + amount1 + "\t\t" +desc1 + "\n");
					}else{
						System.out.println("�������㣡");
					}
					break;
				case '4':
					System.out.print("ȷ���Ƿ��˳���Y/N��:");
					char exit = Utility.readConfirmSelection();
					if(exit == 'Y'){
						isFlag = false;
					}
					break;
					
			}
			
		}while(isFlag);
	}
}