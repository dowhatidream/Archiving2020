package ������;

public class ���� {
	// ���� ��ü�� ������ ��, name field balance�� ���� ������ ��ü�� �������� ���ϰ� �ؾ���
	// �������� ��� �־��� ���� ���¸� �����ϵ��� ����
	String name;
	String field;
	int balance;

	// �Է°��� �����鼭, Ŭ���� �̸��� ������ �޼���
	// �⺻������ �޼���
	// ���α׷��Ӱ� �޼��带 �������� �ʾƵ� �ڵ����� ���������
	public ����() {
		// ������ �޼���� ������ void!!!!
		// �⺻ ������ void�� ���, ���� ������ ���� ��
		// ��ü�����ø���, �ڵ����� �������־�� �ϴ� ó�� ����
		// �ʱ�ȭ��ų ������ ������, �� �޼��忡�� ó�� ����
		// new�� �̿��ؼ� ��ü ������ ������ �ڵ�ȣ��ǹǷ�,
		// ������ �޼���(������)
		// ���� ������� �ʱ�ȭ���� ó���� �־��ݴϴ�
		System.out.println("��ü ������ ���� �ڵ����� ȣ��˴ϴ٤���");
		System.out.println("���� ������� �ʱ�ȭ���� ó���� �־��ݴϴ�");
	}
	
	public ����(String name, String field, int balance) {
		super();
		this.name = name;
		this.field = field;
		this.balance = balance;
	}



	// ��ü ���� ��, ��� ������ ���ִ� ���� �Ѳ����� Ȯ���ϰ��� �ϴ� ��� toString()�� ������
	@Override
	public String toString() {
		return "[name=" + name + ", field=" + field + ", balance=" + balance + "]";
	}	
}
