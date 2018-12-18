$(document).ready(function(){
    $('.collapse').on('show.bs.collapse', function () {
        var obj = $(".panel-info").find(".collapse");
        for(var i = 0;i< obj.length;i++){
            $("#collapseThree"+i).collapse('hide');
        }
    })
    $(".menu_li").on("click",function () {
        var page = $(this).children().attr("page");
       $(".manageContent iframe").attr("src",page);
    })

    $("#addLunbotu").on('click',function () {
        var formdata = new FormData();
        formdata.append("name",$("#name").val());
        formdata.append("link",$("#link").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "addLunbotu",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                console.log(data);
                var obj2 = JSON.parse(data);
                $('#myModal_add').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
})
