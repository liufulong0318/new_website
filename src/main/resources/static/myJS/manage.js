
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
    $('#myModal_addDowhat').on('hide.bs.modal', function () {
        $("#myModal_addDowhat input").val("");
    });
    $('#myModal_addHomeProduct').on('hide.bs.modal', function () {
        $("#myModal_addHomeProduct input").val("");
        $("#myModal_addHomeProduct textarea").val("");
    });
    $('#myModal_tips').on('hide.bs.modal', function () {
        window.location.reload();
    });
    //-------------------------轮播图使用的函数-------------------------START---------------------
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
            $("#edit_id").val(obj2.id);
            $("#edit_name").val(obj2.name);
            $("#edit_link").val(obj2.link);
            $("#edit_order").val(obj2.order);

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
    //修改提交
    $("#editLunbotu").on('click',function () {
        var formdata = new FormData();
        formdata.append("id",$("#edit_id").val());
        formdata.append("name",$("#edit_name").val());
        formdata.append("link",$("#edit_link").val())
        formdata.append("order",$("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "editLunbotu",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_edit').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
//-------------------------轮播图使用的函数-------------------------END---------------------
//-------------------------我们是做什么的使用的函数----------------START---------------------
    //添加
    $("#addDowhat").on('click',function () {
        var formdata = new FormData();
        formdata.append("title",$("#title").val());
        formdata.append("hrefUrl",$("#hrefUrl").val())
        formdata.append("order",$("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "addDowhat",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addDowhat').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteDowhat").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteDowhatById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editDowhat").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getDowhatById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_hrefUrl").val(obj2.hrefUrl);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteDowhat').popover(
        {
            trigger:'hover', //触发方式
            title:"提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content:"确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editDowhat").on('click',function () {
        var formdata = new FormData();
        formdata.append("id",$("#edit_id").val());
        formdata.append("title",$("#edit_title").val());
        formdata.append("hrefUrl",$("#edit_hrefUrl").val())
        formdata.append("order",$("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "editDowhat",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editDowhat').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------我们是做什么的使用的函数----------------END--------------------
    //-------------------------我们的产品使用的函数----------------START---------------------
    //添加
    $("#addHomeProduct").on('click',function () {
        var formdata = new FormData();
        formdata.append("title",$("#title").val());
        formdata.append("hrefurl",$("#hrefUrl").val());
        formdata.append("content",$("#content").val());
        formdata.append("order",$("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "addHomeProduct",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteHomeProduct").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteHomeProductById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editHomeProduct").on('click',function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getHomeProductById",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_hrefUrl").val(obj2.hrefurl);
            $("#edit_content").val(obj2.content);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteHomeProduct').popover(
        {
            trigger:'hover', //触发方式
            title:"提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content:"确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editHomeProduct").on('click',function () {
        var formdata = new FormData();
        formdata.append("id",$("#edit_id").val());
        formdata.append("title",$("#edit_title").val());
        formdata.append("hrefUrl",$("#edit_hrefUrl").val());
        formdata.append("content",$("#edit_content").val())
        formdata.append("order",$("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile",image.files[0]);
        $.ajax({
            url: "editHomeProduct",
            type: "POST",
            data: formdata,
            processData: false,
            contentType : false,
            success :function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------我们的产品使用的函数----------------START---------------------

    $("#addLunbotuForm").validate();
})
