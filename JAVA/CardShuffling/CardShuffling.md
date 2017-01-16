# CardShuffling

## 문제 설명

트럼프 카드를 뽑아내는 것에 대한 문제이다.

임의로 하나의 카드를 뽑는다.(출력 형태는 'Spade A'의 형태이다.)

섞기 전 하나의 카드를 뽑은 결과를 출력한다.(세번 째 카드 출력)

1000번을 Shuffle한 후 하나의 카드를 뽑은 결과를 출력한다.(세번 째 카드 출력)

(Shuffle 하기 전과 후의 카드는 같을 수 있지만 다를 확률이 당연히 더 높을 것이다.)

## class 설명

- Card class

Spade, Diamond, Clover, Heart A~K 형태로 카드를 정의 해주는 생성자 정의 => Card()

'Spade A'의 형태로 출력하여 값을 반환하는 method 정의 => showCard()

- Deck class

뽑은 카드를 보여주는 생성자 정의 => Deck()

카드를 뽑는 method를 정의 => pick()

카드를 섞는 method를 정의 => shuffle()

