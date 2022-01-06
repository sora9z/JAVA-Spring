# java chapter1/ch08 자료형- 문자표현

- ASKII -> 8bit로 되어있다(1byte) 2^8 256 대소문자 52개 특수문자 ... 등 한 바이트로 표현 가능.
- EUCKR (우리나라 문자set)
- 각 나라별 문자 set이 있는데 하나로 호환이안됨.
- 그래서 나온 것이 UNICODE(utf-8, utf16)
- utf 16을 기준으로 설명하면
  2byte로 표현을 한다 . 총 16bit
  1byte는 askii와 완벽하게 호환이 된다. 두 번째 byte는 다른 나라 언어와 호환

### 자바에서는 문자를 어떻게 표현하는가?

- utf-16 : 모든 문자를 2byte씩 표현
- utf-8 : 1-4byte로 유동적으로 사용.
  - 아스키같은 경우 영문으로만 작성 시 2byte씩 사용하게 되므로 overhead가 발생항 수 있기때문에 utf-8사용.
  - 네트워크 통신 or 인터넷은 utf-8을 더 많이 쓴다. multi byte를 사용하는 것이 유리한 경우.
- 'A' != "A" : 전자는 2byte짜리 문자를 의미. 후자는 문자열을 의미
  자바에서는 string리하는 class에서 문자열을 제공한다.
  "A"의 경우 문자열의 끝을 알리는 null이 포함되어있따. A\0

---

# java chapter1/ch09 자료형- 논리형과 자료형 없이 변수 사용하기.

str="test:
str=4  
위와 같이 자료형을 바꿀 수는 없다.
자바 버전을 정확히 확인을 하고 사용해야한다.

# java chapter1/ch10 자료형- 하지 않는 상수와 리터럴, 변수의 형 변환

변지 않는 숫자들이 쓰일 때 상수를 쓴다.
final예약어를 이용하여 선언과 동시에 초기화를 대부분 한다.
상수의 경우는 대문자를 사용하고 긴 경우 \_를 사용한다.

상수를 쓰면 readability가 좋다.

### 리터럴(literal)

- Q: literal이 저장되어있는 공간은 변수가 남아있는 한 남아있음?
- 상수풀?
  하드디스크에 프로그램이 있고 실행을 시키면 프로그램은 ram에 load가 되고 load되는 시점에 프로그램 내부의 자료 중 일부는 메모리를 먼저 할당받는다. (실행과 상관 없이)
  - 위의 경우가 상수, static 변수가 있다. 상수 중 literal이 있다.
  - 위의 영역을 data 영역 또는 constant pool 이라고도 한다.
  - program이 unload될 때 사라진다.

### 형변환

- 묵시적 형변환 (explicit type conversion)
  작은 메모리 -> 큰 메모리 이동 : int type을 long type으로 넣을 경우.
  덜 정밀 (정수) 더 정밀 (실수)

- 명시적 형변환(implicit type conversion)

# java chapter1/ch11 자바의 연산자들 -1 (대입, 부호, 산술, 복합대입, 증감연산자)
