# Sorting Problem

```sh

# [�Է�]

n���� ���ڵ��� �迭 <a1, a2, a3, ... , an>

# [���]

�Էµ� ������ �迭�� ������ �����ϵ��� �ٽ� ������ ��� ��

# [Example]

[input] : <5, 2, 4 ,6, 1, 3>

[output] : <1, 2, 3, 4, 5, 6>

```

## Selection sort(���� ����)

- �ּҰ� ���� ���� : ���� ���� ���� ����(��������)

1. ���ĵ��� ���� ���� �߿� ���� ���� ���ڸ� ����

2. ������ ���ڸ� ���ĵ��� ���� ���ڵ� �� ù ��° ���ڿ� �ڸ��� �ٲٸ� ���õ� ���ڴ� ���ĵ� ��

3. ��� ���ڸ� �ű� �� ���� 1-2���� ������ �ݺ�

- �ִ밪 ���� ���� : ���� ū ���� ����(��������)

```sh

# �ּҰ� ���� ex


[input] : <5, 2, 4, 6, 1, 3>

# ���� ���� ���� 1�� �����ϰ� 5�� change

<1, 2, 4, 6, 5, 3>


# ���� ���� ���� ���� ���� �� �ٽ� ����(2�� ����)

<1, 2, 4, 6, 5, 3>

# 2�� �״�� �����´�. �̿� ���� �迭�� ������ ���� �ݺ�


# �ִ밪 ���ĵ� ������ ���

```

### Selection Sort�� ��Ȯ�� ����

- ������ �ͳ��� �̿�

- i��° ������ ���ڰ� i��°�� ���� or ū ���������� ����


### Selection Sort�� ���� �м�

- �ּ�/�־��� ��� ����ð� : (n ����)

- �ּ�/�־��� ��� ���� : (n)