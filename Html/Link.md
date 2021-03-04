# \<link>:외부 리소스 연결 요소

HTML `<link>`요소는 현재 문서와 외부 리소스의 관계를 명시합니다. `<link>`는 스타일 시트를 연결할 때 제일 많이 사용하지만, 사이트 아이콘("파비콘"과 홈 화면 아이콘) 연결 등 여러가지로 쓰일 수 있습니다.

## 특성

이 요소는 전역 특성을 포함합니다.

**crossorigin**

    리소스를 가져올 때 CORS를 사용해야 하는지 나타내는 열거형 특성입니다. CORS 활성화 이미지는
    \<canvas> 요소를 "오염"(taint)시키지 않고 재사용할 수 있습니다. 가능한 값은 다음과 같습니다.

**anonymous**

    교차 출처 요청(Origin HTTP 헤더를 가진 요청)을 수행하지만 인증 정보, 즉 쿠키, X.509 인증서, HTTP Basic  인증 중 어떠한 것도 전송하지 않습니다. 서버에서 Access-Control-Allow-Origin HTTP 헤더를 설정하지     않아서 출처 사이트에 인증 정보를 전달하지 않으면 리소스가 오염되어 사용처가 제한됩니다.
    use-credentials
    교차 출처 요청(Origin HTTP 헤더를 가진 요청)을 수행하면서 인증 정보, 즉 쿠키, X.509 인증서, HTTP Basic  인증 중 한 가지 이상을 수행합니다. 서버에서 Access-Control-Allow-Origin HTTP 헤더를 설정하지 않아서  출처 사이트에 인증 정보를 전달하지 않으면 리소스가 오염되어 사용처가 제한됩니다.
    crossorigin 특성이 존재하지 않으면 리소스를 CORS 요청 없이 가져오므로 리소스의 오염 없이는 사용이   불가능합니다. 유효하지 않은 값은 anonymous를 지정한 것으로 간주합니다.

**href**

    연결할 리소스의 URL입니다. 절대와 상대 URL 모두 가능합니다.

**hreflang**

    연결할 리소스가 사용하는 언어입니다. 오직 제안하는 용도로만 사용합니다. 가능한 값은
    BCP47에 따릅니다. href  특성이 존재할 때만 사용하세요.

**rel**

    연결할 리소스와 현재 문서의 관계. 링크 유형의 값을 공백으로 구분한 리스트를 지정해야 합니다.