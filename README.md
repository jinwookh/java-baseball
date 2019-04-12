# 1주차 과제 : 숫자 야구 게임
## 1. 숫자를 생성한다. Game.generateRandomNumber(int figure)
- 1부터 9 사이의 랜덤 숫자 세 개를 생성한다.
- 생성한 수 세 개를 붙여서 하나로 만든 후 반환한다.



## 2. 사용자에게서 숫자를 입력받는다. Game.getNumberFromUser()
- 숫자를 입력받을 때 다음과 같은 예외를 처리한다.
    - 숫자가 아닌 특수문자가 포함되는 경우
    - 0이 포함되는 경우
    - 세 자리 수가 아닌 경우
    - 공백이 입력될 경우
- ' '이 앞 또는 뒤에 있는 입력에서 ' '을 없앤다.


## 3. 생성한 숫자와 입력받은 숫자를 비교해서 스트라이크, 볼 등의 결과를 출력한다. BaseBallResult()
- 입력받은 수를 숫자 하나씩 쪼갠다.
- 쪼갠 수와 쪼갠 수의 자리수, 생성한 수를 입력으로 받아, 스트라이크 및 볼과 같은 결과를 출력하는 함수를 만든다.
- 쪼갠 수의 자리수가 1이고, 생성한 수의 1째 자리에 있는 수 == 쪼갠 수라면 스트라이크.
- 생성한 수의 1째 자리에 있는 수 != 쪼갠 수이지만 생성한 수의 둘째 혹은 셋째 자리에 있는 수 == 쪼갠 수라면
볼.
- 입력받은 수의 결과들을 합산한다.
- 3 스트라이크라면 4로 넘어간다.
- 그 이외의 수라면 2-3을 반복한다.

## 4. 사용자에게 다시 게임할 의사가 있는지 묻는다.
- 사용자로부터 수를 입력받는다. 다음과 같은 예외를 처리한다.
    - 수가 아닌 문자가 포함된 경우
    - 1 혹은 2가 아닌 수가 입력될 경우
    - 공백이 입력될 경우
- 1을 입력받으면 과정 1 - 3을 반복한다.
- 2를 입력받으면 프로그램을 종료한다.