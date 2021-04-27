## 정규표현식

📌 **정규표현식 with JS**

> 정규표현식이란 문자열을 검색하고 대체하는 데 사용 가능한 일종의 **형식 언어**입니다.

📌 **정규표현식의 대표적인 역할**

> 1. 문자 검색(search)
> 2. 문자 대체(replace)
> 3. 문자 추출(extract)

📌 **자바스크립트 정규식 생성**

> ### 생성자 함수 방식
>
> `RegExp` 생성자 함수를 호출하여 사용할 수 있습니다.
>
> ```js
> const regexp1 = new RegExp("^abc");
> // new RegExg(표현식)
>
> const regexp2 = new RegExp("^abc", "gi");
> // new RegExg(표현식, 플래그)
> ```

> ### 리터럴 방식
>
> 정규표현식은 `/`로 감싸진 패턴을 리터럴로 사용합니다.
>
> ```js
> const regexp1 = /^abc/;
> // /표현식/
>
> const regexp2 = /^abc/gi;
> // /표현식/플래그
> ```

> ### 재할당
>
> 사용 중인 정규식을 재할당할 수 있습니다.
> 단 상수가 아닌 변수로 선언해야 합니다.
>
> ```js
> let regexp1 = /ipsum/g;
> regexp1 = /lorem/i;
>
> console.log(regexp1);
> // /lorem/i
>
> const regexp2 = /ipsum/g;
> regexp2 = /lorem/i; // TypeError
> ```

> ### 자바스크립트 속성
>
> 자바스크립트에는 정규표현식에서 제공하는 다양한 속성이 있습니다.
>
> | 속성         | 설명                                             |
> | ------------ | ------------------------------------------------ |
> | `flags`      | 플래그(String) 반환, `/^abc/gi.flags`            |
> | `source`     | 표현식(String) 반환, `/^abc/gi.source`           |
> | `global`     | 플래그 `g` 여부(Boolean) 반환, `/^abc/gi.global` |
> | `ignoreCase` | 플래그 `i` 여부(Boolean) 반환                    |
> | `multiline`  | 플래그 `m` 여부(Boolean) 반환                    |
> | `sticky`     | 플래그 `y` 여부(Boolean) 반환                    |
> | `unicode`    | 플래그 `u` 여부(Boolean) 반환                    |
>
> 정규식에서 플래그만 추출할 경우 `flags` 속성을 유용하게 사용할 수 있습니다.
> 알파벳 순서대로 값이 반환됩니다.
>
> ```js
> new RegExp("^abc", "gi").flags;
> // "gi"
>
> /^abc/giy.flags;
> // "giy"
> ```
>
> 표현식을 추출할 경우는 `source` 속성을 사용합니다.
>
> ```js
> new RegExp("^abc", "gi").source;
> // "^abc"
>
> /^abc/giy.source;
> // "^abc"
> ``;
> ```
>
> 플래그 포함 여부도 확인할 수 있습니다.
>
> ```js
> /^abc/giy.global;
> // true
>
> /^abc/giy.ignoreCase;
> // true
>
> /^abc/giy.unicode;
> // false
> ```

> ### 자바스크립트 메소드
>
> 정규표현식을 다루는 다양한 메소드들을 살펴봅시다.
> | 메소드 | 문법 | 설명 |
> | --- | --- | --- |
> | `exec` | `정규식.exec(문자열)` | 일치하는 하나의 정보(Array) 반환 |
> | `test` | `정규식.test(문자열)` | 일치 여부(Boolean) 반환 |
> | `match` | `문자열.match(정규식)` | 일치하는 문자열의 배열(Array) 반환 |
> | `search` | `문자열.search(정규식)` | 일치하는 문자열의 인덱스(Number) 반환 |
> | `replace` | `문자열.replace(정규식,대체문자)` | 일치하는 문자열을 대체하고 대체된 문자열(String) 반환 |
> | `split` | `문자열.split(정규식)` | 일치하는 문자열을 분할하여 배열(Array)로 반환 |
> | `toString` | `생성자\_정규식.toString()` | 생성자 함수 방식의 정규식을 리터럴 방식의 문자열(String)로 반환 |
>
> 우선 테스트를 위해서 다음과 같은 문장을 준비합니다.

> ### 플래그
>
> 위에서 살펴본 것처럼 플래그에 따라서 전혀 다른 결과가 나올 수 있습니다.
> 플래그는 표현식의 옵션으로 표현식으로 검색하려는 문자 패턴에 추가적인 옵션을 넣어 원하는 문자 검색 결과를 반환하도록 할 수 있습니다.

| 플래그 | 설명 |
| `g` | 모든 문자와 여러 줄 일치(global) |
| `i` | 영어 대소문자를 구분 않고 일치(insensitive, ignore case) |
| `m` | 여러 줄 일치(multi line) |
| `u` | 유니코드(unicode) |
| `y` | `lastIndex` 속성으로 지정된 인덱스에서만 1회 일치(sticky) |

📌 **알아두면 좋은**

> **정규표현식 테스트 사이트**
>
> 1. https://regex101.com/
> 2. https://regexr.com/
> 3. https://regexper.com/
