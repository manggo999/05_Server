/* 제목이 작성되지 않은 경우 form 태그 제출 막기*/ 

const addform = document.querySelector("#addform"); // form
const title = document.querySelector("[name=title]"); // input

// addForm이 제출 될 때 
addform.addEventListener("submit", e => {
  // e : 이벤트객체
 
  // 제목 입력 값 가져와서 양쪽 공백 제거
  const input = title.value.trim();

  if(input.length === 0) {
    e.preventDefault();  // form 제출 이벤트 막기
    alert("제목을 입력해주세요");// 알림창 띄우기
    title.focus();// 제목 input 창에 포커싱하기
  }
});
