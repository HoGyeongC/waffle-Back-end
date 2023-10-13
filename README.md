# Waffle
![와플 로고](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/378f2907-138f-410d-ae1d-af137faad142)
- 한줄 소개 : 다수 인원 간의 소통, 의견 공유, 일정 관리에 효율적인 UI를 제공하는 동시에 프로젝트 수행을 위한 다양한 기능을 제공하는 웹서비스
- 세종대학교 2023-1 자기주도창의전공
- 개발 기간 : 2023.02 ~ 2023.06
- 개발 인원 : 3명

## 주소
- 배포 : [~~https://waproject.store~~](https://waproject.store)
- back-end GitHub : [https://github.com/2023-SejongCreative/Back-end](https://github.com/2023-SejongCreative/Back-end)
- front-end GitHub : [https://github.com/2023-SejongCreative/FrontEnd](https://github.com/2023-SejongCreative/FrontEnd)

## 프로젝트 소개
- COVID 19 시기를 겪으면서 대면에 비해 비대면 모임이 증가
- 다수 인원의 팀 프로젝트 시 시간 조율 및 프로젝트 관리에 있어서 난항을 겪음
- 기존 커뮤니케이션 앱 들의 한계, 팀원마다 사용하는 앱의 종류가 달라 따로 익혀 사용해야 한다는 점 등의 문제
  - Notion : 일반 게시글만 등록 가능, 실시간 채팅, 화상채팅 불가능
  - Slack, 카카오톡, 디스코드 : 실시간 채팅과 게시글의 구분 불가능, 캘린더/보드 형태의 일정 관리 미흡
- **문제점을 보완할 수 있는 새로운 웹서비스 Waffle**
  - 실시간 채팅 및 화상 채팅 기능 지원
  - 실시간 채팅과 게시글 기능 분리, 구분
  - 캘린더 및 보드 형태의 일정 관리 기능 지원

## 시연 영상
[![시연 영상](http://img.youtube.com/vi/53iTT8urirE/0.jpg)](https://youtu.be/53iTT8urirE)

## 주요 기능
- 회원가입 및 로그인 기능
  - 회원관리를 위한 각 사용자 별, 그룹 별, 룸 별 데이터 저장
  - JWT, 비밀번호 암호화를 통한 보안성 향상
- 실시간 채팅 및 화상 채팅 기능
  - 팀원 들간 편리한 의사소통 가능
- 그룹, 룸 생성 및 사용자 초대
  - 각 집단 별 독립적 공간 생성 및 정보, 일정 공유
- 게시판 기능
  - 게시글 작성을 통한 그룹, 룸에서의 프로젝트 진행 관리
- 캘린더 및 보드 기능
  - 캘린더 및 보드를 동시 또는 개별로 사용하여 일정 관리, 진행사항 관리 편의성 향상
- 프로필 기능
  - 자신을 이미지 및 한줄 소개로 나타내고 현재 진행 중인 프로젝트를 게시
  - 타인의 프로필을 열람
 
## 화면 구성

  | <img width="437" alt="회원가입" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/d1ad0603-e7a5-4f49-b422-1f482cd85f44">| <img width="437" alt="로그인" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/b83f57ae-d799-40c3-91b3-9ea8fd1c5135"> |
  |:---:|:---:|
  | 회원가입 | 로그인 |

  |<img width="437" alt="실시간 채팅" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/6c84e344-1bf2-4126-a9e2-10405086d167"> | <img width="437" alt="화상 채팅" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/7b7e0adf-1df6-4281-9a05-9bb85409473c"> |
  |:---:|:---:|
  | 실시간 채팅 | 화상 채팅 |

  |<img width="437" alt="캘린더" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/1414a309-7ba4-46fa-b785-abbd44c653ea">  | <img width="437" alt="보드" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/af6164d2-2434-4443-9722-2fdd3071638b"> |
  |:---:|:---:|
  | 캘린더 | 보드 |

  |<img width="437" alt="본인 프로필" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/7f5026a5-da0b-4e3b-b582-dbfa3315ed17"> | <img width="437" alt="타인 프로필" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/4704681a-0dd6-4d7a-84b4-333d4186095f"> |
  |:---:|:---:|
  | 본인 프로필 | 타인 프로필 |

  | <img width="437" alt="그룹 생성" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/02ab0dfc-0a7d-4689-9db0-34c05b533162"> |<img width="437" alt="그룹 초대" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/6f90e5bd-e4c6-4888-8478-e37b216e3928"> |
  |:---:|:---:|
  | 그룹 생성 | 그룹 초대 |

  | <img width="437" alt="룸 생성" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/0f559a89-16de-4f38-9eee-19166c76dcb9"> | <img width="437" alt="룸 초대" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/a8bb7b07-c4a9-485b-9b5d-9f9771129095"> |
  |:---:|:---:|
  | 룸 생성 | 룸 초대 |  

  |<img width="437" alt="게시판" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/374112e6-5fe9-4e91-bd3e-a22b2cee95bc">  | <img width="386" alt="로그아웃" src="https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/312a57f5-87f8-4ac2-b94f-3f58fa984aa6"> |
  |:---:|:---:|
  | 게시판 | 로그아웃 |

## 기술 스택
- BackEnd
  - IntelliJ
  - Postman
  - Java 17
  - spring boot 3.0.4
  - spring boot-jpa
  - spring Security
  - gradle
  - MySQL
  - Redis
  - websocket
  - STOMP
- FrontEnd
  - VScode
  - JavaScript
  - React
  - Axios
  - Style Component
  - STOMP
  - NPM
- WebRTC
  - openvidu 2.27.0
  - openvidu browser 2.27.0
- 협업 및 형상 관리
  - Figma
  - Notion
  - Discode
  - Git & GitHub
- 배포
  - AWS EC2, RDS
  - Docker
  - Nginx

## 아키텍쳐
![아키텍쳐](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/e35e4f9c-3248-441a-8550-c627023bee81)

## ERD
![ERD](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/d7b44ad5-5a6d-459f-815e-9a0ec8c5261b)

## 디자인 설계
![피그마](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/e187053f-0557-4c79-b3ae-8425f83c5435)

## 최종 테스트
![테스트 케이스1](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/da0dfcbf-d0d7-452b-a2e7-d41fdd525c92)
![테스트 케이스2](https://github.com/HoGyeongC/waffle-Back-end/assets/114250166/7ff9e55d-1f30-4db1-9da1-1a703f047bdb)


## 팀원 소개 및 역할
- **최호경(본인, 백엔드)**
  - figma를 사용한 웹서비스 디자인 및 설계
  - MySQL을 사용한 ERD 및 데이터 베이스 구축
  - Spring security, JWT, Redis를 이용한 회원가입 기능 구현
  - 백엔드 회원가입, 그룹, 프로필, 일정, 채팅방 각각의 CRUD 기능을 RESTful API로 구현
  - websocket, STOMP를 사용한 실시간 채팅 기능 구현
  - 통합 테스트 문서 작성 및 통합 테스트
  - AWS, Nginx, Docker를 이용한 클라우드 서버 구축

- 전서현(팀장, 백엔드)
  - figma를 사용한 웹서비스 디자인 및 설계
  - MySQL을 사용한 ERD 및 데이터 베이스 구축
  - Spring security, JWT, Redis를 이용한 회원가입 기능 구현
  - 백엔드 로그인, 룸, 게시판, 일정 CRUD 기능을 RESTful API로 구현
  - openvidu를 이용한 화상채팅 기능 구현
  - 통합 테스트 문서 작성 및 통합 테스트
  - AWS, Nginx, Docker를 이용한 클라우드 서버 구축

- 주다현(프론트엔드)
  - UI/UX 설계 및 UI 구현
  - 프론트엔드 전반의 CRUD 구현
  - openvidu 플랫폼을 이용한 화상채팅 기능 구현
  - 소켓 통신과 StompJS를 이용한 실시간 채팅 기능 구현
  - jwt를 이용한 로그인 기능 구현
  - 프론트엔드 배포를 위한 docker 이미지화


## 개발 후에..
- 단위 및 통합 테스트의 중요성을 알게 되었다.
  - 항상 어떠한 기능에 대한 코드를 작성할 때에는 하위 branch를 생성하고 코드를 Postman에서 테스트한 후에 상위 branch와 merge 했었다. Postman으로 테스트를 할 때에는 아무런 문제가 없더라도 프론트와 직접 연결해서 막상 request와 response를 주고 받으면 꼭 문제가 발생하기 마련이었고 오류들이 쌓이지 않도록 항상 한 가지의 기능을 구현하고 나면 단위 테스트를 통해 현재의 문제를 찾고 해결하고 다음 단계로 나아가려고 했다.
  - 항상 단위 테스트를 진행하고 문제를 해결하고 난 후에 다음 단계로 넘어갔기 때문에 통합 테스트에서는 큰 문제가 발견되지 않을 것이라고 생각했었다. 그럼에도 프로그램을 완성한 후에 테스트 케이스를 먼저 작성하고 통합 테스트를 진행하였는데, 작거나 큰 문제들이 다수 발생하였다. 여기서 단위 테스트와 통합 테스트는 완전히 별개라는 것을 알게 되었고 통합 테스트의 중요성을 알게 되었다.
- 의사소통은 언제나 중요하다.
  - 이번 프로젝트 팀원 들은 모두 같은 과 같은 학번의 동기이자 친구였기에 다툼이나 큰 문제없이 프로젝트가 진행되었다. 그럼에도 각자가 말 하는 방식이나 같은 말을 듣고도 생각했던 것 들이 다른 경우가 종종 있었다. 특히 팀원 모두가 처음 프로젝트를 해봤기 때문에 프로젝트를 진행하는 방식에 대해 무지했고 프론트와 백엔드는 서로의 코드나 작동 방식을 몰랐기 때문에 의사소통에서 어려움을 겪었다. 그럴때마다 최대한 이해할 수 있는 방향으로 설명하고 상대방의 방식도 최대한 이해하려고 노력했다. 의사소통은 서로가 서로에게 완벽할 수는 없으니 항상 노력하려는 마음가짐을 가지도록 노력해야겠다.
- 했던 말은 문서화 시켜놓자
  - 프로젝트 초반에 말로 진행하고 문서나 기록으로는 남겨두지 않았던 기능, 세부 기능이 많았다. 막상 프로젝트를 진행하다보니 해야할 일이 많아지고 이전에 나눴던 대화는 팀원 들이 기억하는 형태가 모두 달랐다. 이전에 문서화를 시켜놓았다면 다시 회의를 해야할 일도 없었을 것이고 시간을 더욱 효율적으로 사용할 수 있었을 것이라는 점에서 아쉬웠다.
