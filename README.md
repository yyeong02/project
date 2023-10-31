# project
2023 졸업프로젝트_v2

---



### 기능 (마지막 업데이트 : 2023.06.12)
1. 회원 관리
    - 회원가입
    - 로그인
2. 폐의약품 수거함 지도
    - 지도
      - 폐의약품 수거함 위치 확인
      - 폐의약품 수거함 정보 확인
      - "도로명주소로 검색" 클릭시 카카오맵 사이트로 이동
    - 폐의약품 수거함 리스트
      - 가까운 위치순으로 출력
      - 각 구별 폐의약품 수거함 확인 가능
      - 리스트 클릭시 해당 약국위치로 지도 이동
    - 모바일버전, 데스크탑 버전 분리
2. 약국 지도
    - 지도
      - 약국 위치 확인
      - 약국 정보 확인
      - "도로명주소로 검색" 클릭시 카카오맵 사이트로 이동
    - 약국 리스트
      - 가까운 위치순으로 출력
      - 각 구별 약국 확인 가능
      - 리스트 클릭시 해당 약국위치로 지도 이동
    - 모바일버전, 데스크탑 버전 분리
3. 다이어리
    - 달력 제공
      - 의약품 정보 추가
      - 의약품 정보 확인



---



### 테스트 방법
1. 스프링부트 파일 실행
2. http://localhost:8080(포트번호)/home 접속
3. 로그인
    - 로그인 버튼 클릭
    - 회원가입 버튼 클릭
    - 아이디/ 비밀번호/ 이름 입력
    - 완료
    - 가입한 정보로 로그인
4. 지도
    - 약국 찾기나 폐의약품 찾기 버튼 클릭
    - 원하는 지역 버튼 클릭
    - 리스트에 장소 버튼을 클릭 / 지도의 장소 버튼 클릭
    - 오버레이 출력
    - 오버레이의 도로명주소를 클릭 -> 카카오맵 사이트로 이동
5. 달력
    - /home 의 달력 버튼 클릭
    - 오늘의 날짜 확인 가능
    - 날짜 선택
    - (+) 버튼 클릭 (의약품 정보 추가 위해)
    - 의약품의 이름/ 섭취 기간(시작 날짜 & 종료 날짜)/ 섭취 빈도(아침/ 점심/ 저녁/ 식전 30분/ 식후 30분) 입력 및 선택
    - 완료
    - 달력을 통해 입력한 의약품 정보 확인 가능



---



### 업데이트 예정
1. 의약품 정보 관리 추가
    - 입력한 의약품의 섭취 기간에 해당하는 날짜 선택했을 때만 의약품 정보 출력
2. 관리자 채팅 기능 추가

+ 안드로이드 버전 개발 예정
