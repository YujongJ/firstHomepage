

# 0. 호스팅 중인 사이트 (시작하기)
[홈페이지 링크](http://localhost:8080/)

<br/>
<br/>

# 1. Project Overview (프로젝트 개요)
- 프로젝트 이름: 개인 홈페이지 + CRUD BOARD
- 프로젝트 설명: 개인 홈페이지에 CRUD 기능이 있는 게시판을 합쳐 커뮤니티처럼 구현한다.

<br/>
<br/>


# 2. Key Features (주요 기능)
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



# 3. Technology Stack (기술 스택)
## 3.1 BackEnd
|  |  |
|-----------------|-----------------|
| JAVA    |  <img src="https://github.com/user-attachments/assets/c39f5ffd-6fdf-42a6-862b-e12b3f3d4ac8" alt="git" width="100">    |
| SPRING BOOT    |  <img src="https://github.com/user-attachments/assets/0511f24d-1dc5-4685-bdac-9673cdecfa07" alt="git" width="100">    |
| MyBatis    |  <img src="https://github.com/user-attachments/assets/6d90a6b5-ce72-40be-8c83-b38c52336920" alt="git" width="100">    |

## 3.2 DataBase
|  |  |
|-----------------|-----------------|
| MySQL    |  <img src="https://github.com/user-attachments/assets/e9329ff4-1290-479f-baf9-de1dc7fe103a" alt="git" width="100">    |

## 3.3 FrontEnd
|  |  |
|-----------------|-----------------|
| HTML    |<img src="https://github.com/user-attachments/assets/2e122e74-a28b-4ce7-aff6-382959216d31" alt="HTML5" width="100">| 
| CSS3   |   <img src="https://github.com/user-attachments/assets/c531b03d-55a3-40bf-9195-9ff8c4688f13" alt="CSS3" width="100">|
| Javascript    |  <img src="https://github.com/user-attachments/assets/4a7d7074-8c71-48b4-8652-7431477669d1" alt="Javascript" width="100"> | 

## 3.4 Configuration
|  |  |
|-----------------|-----------------|
| Git    |  <img src="https://github.com/user-attachments/assets/483abc38-ed4d-487c-b43a-3963b33430e6" alt="git" width="100">    |
<br/>





<br/>


# 4.MySQL


-- board_table<br/>
 drop table if exists board_table;<br/>
 create table board_table<br/>
 (<br/>
	id bigint primary key auto_increment,<br/>
    boardTitle varchar(50),<br/>
    boardWriter varchar(20),<br/>
    boardPass varchar(20),<br/>
    boardContents varchar(500),<br/>
    boardHits int default 0,<br/>
    createdAt datetime default now(), <br/>
    fileAttached int default 0<br/>
);<br/><br/>



-- board_file_table<br/>
drop table if exists board_file_table;<br/>
create table board_file_table<br/>
(<br/>
    id	bigint auto_increment primary key,<br/>
    originalFileName varchar(100),<br/>
    storedFileName varchar(100),<br/>
    boardId bigint,<br/>
    constraint fk_board_file foreign key(boardId) references board_table(id) on delete cascade<br/>
);<br/><br/>


--comment<br/>
CREATE TABLE comment (<br/>
    commentId BIGINT AUTO_INCREMENT PRIMARY KEY,  <br/>
	postId BIGINT NOT NULL,<br/>
    commentContent TEXT NOT NULL,         <br/>        
    commentCreatedat TIMESTAMP DEFAULT CURRENT_TIMESTAMP, <br/>
    comment_writer varchar(100),<br/>
    FOREIGN KEY (postId) REFERENCES board_table(id) ON DELETE CASCADE <br/>
);<br/>
