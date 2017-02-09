#KoNLP_Package

##Intro

R���� �ѱ�� ���� ���� ����ϱ� ���� "�����"�� ���� Package.

�ѱ��� ���� �۾����� ��κ� �� ���.

[Reference] : Search in Google as "KoNLP in r"

'''shell

install.packages("KoNLP")

library(KoNLP)


# install.packages : package�� ��ġ

# library() : ��ġ�� ��Ű���� Loading

'''

## extractNoun

- extractNoun : �ѱ��� �Է� �޾� ��縦 �������ִ� �Լ�(Hannanum analyzer�� ���)

[Reference] : (http://kldp.net/projects/hannanum)

'''shell

v1 <- ("���� ������ �����̰� ������ ������ �����Դϴ�. �׸��� �ܿ�����")

# [Grammer]���� <- ������ : ������ �����͸� ����

v1

# ��� : [1]"���� ������ �����̰� ������ ������ �����Դϴ�. �׸��� �ܿ�����"

extract(v1)

# ��� : [1] "����" "����" "����" "�ܿ�"

v2 <- ("�������� �鿩���̰� �����������鰡�� �Դϴ�")

extractNoun(v2)

# ��� : "�鿩���̰�" "����"       "����"       "����"       "����"    

# extractNoun�� ������ �������� �ܾ �Ǵ���.

'''

## sapply : ���� �ٷ� �� �����͸� ó���ؾ� �� ��� ���

'''shell

v3 <- ("���� ������ �����̰� ������ ������ �����Դϴ�",

+ "�׸��� �ܿ�����")

extractNoun(v3)

# error : extractNoun �Լ��� �� �ٸ� ó�� ����

v4 <- sapply(v3,extractNoun,USE.NAMES=F)

v4

# ��� : [[1]] [1] "����" "����" "����" [[2]] [1] "�ܿ�"

'''

## Refer

[R��� by ������]
