# 해쉬를 사용해야하는 경우 

## 1. 중복을 없애고 싶은경우 hashSet 을 이용해서 중복을 간편하게 없앨 수 없다.
### 물론 반복문을 사용해서 없앨 수도 있지만 이렇게 하면 시간복잡도가 증가하게 된다.
### 참고 문제 PocketMon

## 2. 문자열 데이터를 관리해야하는 경우
### 문자열 데이터의 경우는 숫자나 boolean 보다 관리가 어려워진다. 그래서 hash 의 특징인 키 밸류를 이용하여 더 수월하게 관리가 가능하다.
### 참고 문제 Marathon

## 3. 포함하는 데이터 찾기
### hash 의 containsKey 함수를 이용해 반복문으로 포함하는 데이터를 쉽게 찾을 수 있다.
### 참고문제 PhoneBook

## 4. 조합하는 문제
### hash 에 키와 정수로 해당 데이터의 경우의 수를 저장한 다음 조합을 하면 편리하다.
### 참고문제 Clothes

