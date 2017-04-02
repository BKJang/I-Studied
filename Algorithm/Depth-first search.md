# Depth-first search

- ����� ������ ��� Ȯ������ �ʰ� �� �������� ���� Ž��(�ֺ��� �ִ� ��带 ���� Ž���ϴ� BFS�ʹ� ���ȴ�)

- �ð��� �켱���� �ϴ� �׷��� Ž��

## Time stamp

- �� ������ v.d�� v.f�� ������ �ִ�.

- v.d : �߰� �ð�(discovery time, ȸ��)

- v.f : �Ϸ� �ð�(finishing time, ������)


## ������ �� ����

- �ʱ�ȭ�� ���� : ���(not discovered)

- �߰ߵ� ���� : ȸ��(discovered)

- �Ϸ�� ���� : ������(finished)

- �Ϸ��� �ǹ̴� ��� ������ �������� ������ ���


## Ž�� ����

![Markdown Here logo](http://cfile21.uf.tistory.com/image/21493C3658DCB8B13CD977)

- u(gray) -> v(gray) -> y(gray) -> x(gray) -> x(black) -> y(black) -> v(black) -> u(black) -> w(gray) -> z(gray) -> z(black) -> w(black)


## ���� �켱 Ž�� ��

- ���� ���� �׷����� ���� �켱 Ž�� ��

![Markdown Here logo](http://cfile5.uf.tistory.com/image/23158B3658DCB8AF1D9B8F)


## Parenthesis theorem(for gray interval)

- ���� ���� Ž���̶�� ���� �������� ���� �������� ��� ����

- ��, ���� ������ ���� ����

![Markdown Here logo](http://cfile5.uf.tistory.com/image/2605AE3658DCB8B02BEFBE)


## ������ �з�

![Markdown Here logo](http://cfile1.uf.tistory.com/image/2335433658DCB8B00A2573)

- Ʈ�� ����(Tree edges) : ���д� Ʈ���� ���Ե� ��� ����

- ���� ����(Cross edges) : ������ �ڼ� ���谡 �ƴ� �������� ����� ����

- ���� ����(Back edges) : Ʈ�� ������ �ƴ� �ڼտ��� ������ ����� ����

- ���� ����(Forward edges) : Ʈ�� ������ �ƴϰ� �������� �ڼ����� ����� ����


- �����⼺ �׷����� Depth-first search���� �׷����� �� ������ Ʈ�� �����̰ų� ���� ����

- �����⼺ �׷������� ���� ������ ���� ������ ������ ���� ��� ������ ��������� �����ϱ� ������ ���� ���� ���� ���� �� ����. 


## ����ð� 

- ���� �ð� : O(V+E)