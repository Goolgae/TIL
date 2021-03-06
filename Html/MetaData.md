# 메타데이터

메타데이터의 가장 단순한 정의는 데이터를 설명하는 데이터입니다. 예를 들어 HTML은 데이터입니다. 그리고 HTML의 `<head>` 안에는 문서 작성자나 문서 요약과 같이 문서를 설명하는 데이터, 즉 메타데이터를 넣을 수 있습니다.랄까요?

# \<meta>: 문서 레벨 메타데이터 요소

HTML`<meta>`요소는 \<base>, \<link>, \<script>, \<style>, \<title>과 같은 다른 meta 관련 요소로 나타낼수 없는 메타데이터를 나타냅니다.

> `meta`요소가 제공하는 메타데이터는 다음 네 유형 중 하나입니다.

- name 특성을 지정하면 전체 페이지에 적용되는 "문서 레벨 메타데이터"를 제공합니다.
- http-equiv 특성을 지정하면 유사한 이름의 HTTP 헤더가 제공하는 정보와 동일한 "프래그마 지시문"이 됩니다.
- charset 특성을 지정하면 문서 인코딩에 사용한 문자 인코딩을 나타내는 "문자 집합 선언"이 됩니다.
- itemprop 특성을 지정하면 "사용자 정의 메타데이터"를 제공합니다.

# 특성

이 요소는 전역 특성을 포함합니다.

> **참고** : name 특성은 \<meta> 요소에 대해 특정한 의미를 가집니다. 하나의 \<meta> 요소에서, itemprop 특성을 name, http-equiv 또는 charset 특성과 함께 설정할 수 없습니다.

`charset`

    페이지의 문자 인코딩을 선언합니다. 이 특성이 존재할 경우, 그 값은 반드시 문자열 "UTF-8"로 하시는게 좋을듯 싶습니다. 이유는 구글링 ^^

`content`

    `http-equiv` 또는 `name` 특성의 값을 담습니다.

`name`

    name과 content 특성을 함께 사용하면 문서의 메타데이터를 이름-값 쌍으로 제공할 수 있습니다.
    name은 이름,content는 값을 담당합니다.

`http-equivalent`는 그냥 환경에 지시를 내린다고 알아두겠습니다.
