public interface Login {
	/**�α���
	 *- �Է� : ���̵�, ��й�ȣ
	 *- ��� : boolean or void-���� or Name or ȸ������==> No ���� Ŭ���� */
	Member login(String userId, String userPw) throws
	   LoginIDMinLengthException, PasswordDefaultLengthException;
}