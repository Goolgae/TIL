# 참조 (reference)

**전자화된 시스템의 가장 중요한 특징은 복제**다. 현실의 사물과 다르게 전자화된 시스템 위의 데이터를 복제 하는데는 비용이 거의 들지 않는다. 바로 이러한 특징이 소프트웨어를 기존의 산업과 구분하는 가장 큰 특징일 것이다. 프로그래밍에서 복제가 무엇인가를 살펴보자.

그런데 자연의 산물이 아니라 거대한 집합인 소프트웨어의 세계에서 당연한 것은 없다. (인용해서 적고 있는데 이거 뭔소리인지 모르겠다.)

이것은 변수 b와 변수 a에 담긴 인스턴스가 서로 같다는 것을 의미하다. 참조(reference)의 세계에 온 것을 환영한다.

앞서 필자는 전자화된 세계에서 가장 중요한 특징으로 복제를 들었다. 그런데 복제만으로 전자화된 시스템을 설명하는 것은 조금 부족하다. 비유하자면 복제는 파일을 복사하는것이고 참조는 [심볼릭 링크](./Symbolic.md)혹은 바로가기를 만드는 것과 비슷하다. 원본파일에 대해서 심볼릭 링크는 만들면 원본이 수정되면 심볼릭 링크에도 그 내용이 실시간으로 반영되는 것과 같은 효과다. 심볼릭 링크를 통해서 만든 파일은 원본 파일에 대한 작업을 하게 된다. 다시 말해서 원본을 복제한것이 아니라 원본파일을 참조하고 있는 것이다. 덕분에 저장 장치의 용량을 절약할 수 있고, 원본 파일을 사용하고 있는 모든 복제본이 동일한 내용을 유지할 수 있게 된다. 참조는 전자화된 세계의 극치라고 할 수 있다고 한다.
