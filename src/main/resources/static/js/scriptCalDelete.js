const btnClickHandler = () =>{
    var conf = confirm("정말 삭제하시겠습니까?")
    let num = document.getElementById("tempPShowCalendar").innerText
    if(conf==true) location.replace("/calendar/delete/"+num)
}