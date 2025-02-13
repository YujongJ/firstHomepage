

<br/>
<br/>

# 0. Getting Started (시작하기)
[서비스 링크](http://localhost:8080/)

<br/>
<br/>

# 1. Project Overview (프로젝트 개요)
- 프로젝트 이름: 개인 홈페이지 + CRUD BOARD
- 프로젝트 설명: 개인 홈페이지에 

<br/>
<br/>


# 3. Key Features (주요 기능)
- **CRUD 기능**:
  - 기본적인 글 생성, 수정, 삭제, 읽기 기능.
  - 데이터베이스에 저장된 패스워드로 수정 삭제 가능

- **댓글 기능**:
  - Json/Ajax를 이용한 댓글 기능
  - 데이터베이스에 저장된 패스워드로 수정 삭제 가능

- **페이징 기능**:
  - 글 리스트 최대 10개 페이징 처리

- **최신글 5개 홈화면 출력**:
  - CreatedAt을 기준으로 최신 글 5개 홈화면 출력


<br/>
<br/>



# 5. Technology Stack (기술 스택)

|  |  |
|-----------------|-----------------|
| HTML    |<img src="https://github.com/user-attachments/assets/2e122e74-a28b-4ce7-aff6-382959216d31" alt="HTML5" width="100">| 
| CSS3   |   <img src="https://github.com/user-attachments/assets/c531b03d-55a3-40bf-9195-9ff8c4688f13" alt="CSS3" width="100">|
| Javascript    |  <img src="https://github.com/user-attachments/assets/4a7d7074-8c71-48b4-8652-7431477669d1" alt="Javascript" width="100"> | 
| Git    |  <img src="https://github.com/user-attachments/assets/483abc38-ed4d-487c-b43a-3963b33430e6" alt="git" width="100">    |
<br/>





<br/>


# 6.MySQL


-- board_table
 drop table if exists board_table;
 create table board_table
 (
	id bigint primary key auto_increment,
    boardTitle varchar(50),
    boardWriter varchar(20),
    boardPass varchar(20),
    boardContents varchar(500),
    boardHits int default 0,
    createdAt datetime default now(), 
    fileAttached int default 0
);



-- board_file_table
drop table if exists board_file_table;
create table board_file_table
(
    id	bigint auto_increment primary key,
    originalFileName varchar(100),
    storedFileName varchar(100),
    boardId bigint,
    constraint fk_board_file foreign key(boardId) references board_table(id) on delete cascade
);


--comment
CREATE TABLE comment (
    commentId BIGINT AUTO_INCREMENT PRIMARY KEY,  
	postId BIGINT NOT NULL,
    commentContent TEXT NOT NULL,                 
    commentCreatedat TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    comment_writer varchar(100),
    FOREIGN KEY (postId) REFERENCES board_table(id) ON DELETE CASCADE 
);
