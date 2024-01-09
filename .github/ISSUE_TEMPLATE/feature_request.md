---
name: Feature request
about: Suggest an idea for this project
title: "[Feat]"
labels: ''
assignees: ''

---

Description
---
- 기존에는 OAuth2를 통해 소셜 로그인에 성공하였을 때,  short-lived 쿠키를 통해 RefreshToken을 저장할 수 있도록 하였다. 
- 하지만 HttpOnly 설정으로 프론에서 쿠키 접근이 불가능한 상황으로 추가적인 요청을 통해 RT를 프론트로 전달할 수 있도록 한다.

Progress
---
- [x] RefreshToken 및 회원 정보를 전달한 API 작성
- [x] postman을 통한 http 통신 테스트
- [ ] 서버 배포 후, OAuth2 URL 설정 변경
