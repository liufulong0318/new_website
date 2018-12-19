
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
    $('#myModal_add').on('hide.bs.modal', function () {
        $("#myModal_add input").val("");
    });

    $('#myModal_tips').on('hide.bs.modal', function () {
        window.location.reload();
    });
    //添加
    $("#addLunbotu").on('click',function () {
        var formdata = new FormData();
        formdata.append("name",$("#name").val());
        formdata.append("link",$("#link").val())
        formdata.append("order",$("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "addLunbotu",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_add').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    // $('#myModal_del').on('hide.bs.modal', function () {
    //     window.location.reload();
    // });
    // $('.btn-primary').on('show.bs.popover', function () {
    //     // 执行一些动作...
    //     $('.btn-primary').popover('toggle');
    // })
//删除
    $(".delete").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteLunbotuById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".edit").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getLunbotuById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#edit_name").val(obj2.name);
            $("#edit_link").val(obj2.link);
            $("#edit_order").val(obj2.order);
            // $("#myModal_tips .modal-body").html(obj2.msg);
            // $("#tips").click();
        });
    })
    $('.delete').popover(
        {
            trigger:'hover', //触发方式
            title:"提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content:"确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );

    $("#addLunbotuForm").validate();
})
