# Hoisting

`함수 안에 있는 선언들을 모두 끌어올려서 해당 함수 유효 범위의 최상단에 선언하는 것`을 말한다.

## 호이스팅이란

호이스팅은 ES2015 언어 명세 및 그 이전 표준 명세에서 사용된 적이 없는 용어입니다. 호이스팅은 Js에서 실해 콘텍스트가 어떻게 동작하는가에 대한 일반적인 생각으로 여겨집니다. 하지만 호이스팅은 오해로 이어질 수 있습니다.

예를 들어, 호이스팅을 변수 및 함수 선언이 물리적으로 작성한 코드의 상단으로 옮겨지는 것으로 가르치지만, 실제로는 그렇지 않습니다. 변수 및 함수 선언은 컴파일 단계에서 메모리에 저장되지만, 코드에서 입력한 위치와 정확히 일치한 곳에 있습니다.

# Learn more

기술 예제

JavaScript가 어떤 코드 구분을 실행하기 전에 함수 선언을 메모리에 저장하는 방식의 장점 중 하나는 코드에서 선언하기 전에 함수를 사용할 수 있다는 것입니다. 예를 들어:

> ```js
> function catName(name) {
>   console.log("My cat's name is " + name);
> }
> catName("Tigger");
> /*
> 위 코드의 결과는: "My cat's name is Tigger"
> */
> ```

위 코드 [스니펫](.../Etc/Snippet.md)은 통상적으로 작동하는 코드를 작성하는 법에 관해 기술합니다. 이제, 함수를 작성하기 전에 함수를 호출하면 어떤 일이 있는지 살펴봅시다:

> ```js
> catName("Chloe");
>
> function catName(name) {
>   console.log("My cat's name is " + name);
> }
> /*
> 위 코드의 결과는: "My cat's name is Chloe"
> */
> ```

비록 함수를 작성하기 전에 함수를 호출하였지만, 코드는 여전히 동작하비낟. 이는 Js에서 컨텍스트 실행이 작동하는 방식 때문입니다.

Hoisting은 다른 데이터 타입 및 변수와도 잘 작동합니다. 변수는 선언하기 전에 초기화하여 사용될 수 있습니다. 그러나 초기화 없이는 사용할 수 없습니다.