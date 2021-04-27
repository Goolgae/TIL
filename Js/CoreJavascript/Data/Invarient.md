# 불변값

변수와 상수를 구분하는 성질은 '변경 가능성'입니다. 바꿀 수 있으면 변수, 바꿀 수 없으면 상수입니다. 불변값과 상수를 같은 개념으로 오해하기 쉬운데(저 또한 오해하고 있었음), 이 둘은 정확히 구분할 필요가 있습니다.
변수와 상수를 구분 짓는 변경 가능성의 대상은 변수 영역 메모리입니다. 한 번 데이터 할당이 이뤄진 변수 공간에 다른 데이터를 재할당할 수 있는지 여부가 관건입니다. 반면 불변성 여부를 구분할 때의 변경 가능성의 대상은 데이터 영역 메모리입니다.
기본형 데이터인 숫자, 문자열, boolean, null, undefined, Symbol은 모두 불변값입니다. 그 중 숫자와 문자열을 예로 들어 불변성의 개념을 알아봅시다.

```js
var a = "abc";
a = a + "def";

var b = 5;
var c = 5;
b = 7;
```

우선 예제 의 1~2번째 줄을 봅시다. 변수 a에 문자열 'abc'를 할당했다가 뒤에 'def'를 추가하면 기존의 'abc'가 'abcdef'로 바뀌는 것이 아니라 새로운 문자열을 만들고 그 주소를 변수 a에 저장합니다.
완전히 다른 데이터라고 할 수 있는 것이죠.

4번째 줄에서는 변수 b에 숫자 5를 할당합니다. 그러면 컴퓨터는 일단 데이터 영역에서 5를 찾고, 없으면 그제서야 데이터 공간을 하나 만들어 저장합니다.
그 주소를 b에 저장합니다. 5번째 줄에서는 다시 같은 수인 5를 할당하려고 합니다. 컴퓨너틑 데이터 영역에서 5를 찾습니다. 4번째 줄에서 이미 만들어 놓은 값이 있으니 그 주소를 재활용합니다.

6번째 줄에서는 변수 b의 값을 7로 바꾸고자 합니다. 그러면 기존에 저장된 5자체를 7로 바꾸는 것이 아니라 기존에 젖아했던 7을 찾아서 있으면 재활용하고, 없으면 새로 만들어서 b에 저장합니다. 결국 5와 7 모두 다른 값으로 변경할 수 없습니다.

변경은 새로 만드는 동작을 통해서만 이뤄집니다. 이것이 바로 불변값의 성질입니다. 한 번 만들어진 값은 가비지 컬렉팅을 당하지 않는 한 영원히 바뀌지 않습니다.