$(document).ready(function () {
    $('.collapse').on('show.bs.collapse', function () {
        var obj = $(".panel-info").find(".collapse");
        for (var i = 0; i < obj.length; i++) {
            $("#collapseThree" + i).collapse('hide');
        }
    })
    $(".menu_li").on("click", function () {
        var page = $(this).children().attr("page");
        $(".manageContent iframe").attr("src", page);
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
    $('#myModal_addIndustryCase').on('hide.bs.modal', function () {
        $("#myModal_addIndustryCase input").val("");
    });
    $('#myModal_tips').on('hide.bs.modal', function () {
        window.location.reload();
    });
    //-------------------------轮播图使用的函数-------------------------START---------------------
    //添加
    $("#addLunbotu").on('click', function () {
        var formdata = new FormData();
        formdata.append("name", $("#name").val());
        formdata.append("link", $("#link").val())
        formdata.append("order", $("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addLunbotu",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_add').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".delete").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteLunbotuById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".edit").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getLunbotuById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_name").val(obj2.name);
            $("#edit_link").val(obj2.link);
            $("#edit_order").val(obj2.order);

        });
    })
    $('.delete').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editLunbotu").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("name", $("#edit_name").val());
        formdata.append("link", $("#edit_link").val())
        formdata.append("order", $("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editLunbotu",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
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
    $("#addDowhat").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        formdata.append("hrefUrl", $("#hrefUrl").val())
        formdata.append("order", $("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addDowhat",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addDowhat').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteDowhat").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteDowhatById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editDowhat").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getDowhatById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_hrefUrl").val(obj2.hrefUrl);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteDowhat').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editDowhat").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        formdata.append("hrefUrl", $("#edit_hrefUrl").val())
        formdata.append("order", $("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editDowhat",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
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
    $("#addHomeProduct").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        formdata.append("hrefurl", $("#hrefUrl").val());
        formdata.append("content", $("#content").val());
        formdata.append("order", $("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addHomeProduct",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteHomeProduct").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteHomeProductById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editHomeProduct").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getHomeProductById", obj, function (data, status) {
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
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editHomeProduct").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        formdata.append("hrefUrl", $("#edit_hrefUrl").val());
        formdata.append("content", $("#edit_content").val())
        formdata.append("order", $("#edit_order").val())
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editHomeProduct",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------我们的产品使用的函数----------------END---------------------
    //-------------------------行业案例使用的函数----------------START---------------------
//添加
    $("#addIndustryCase").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        formdata.append("hrefurl", $("#hrefUrl").val());
        formdata.append("order", $("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addIndustryCase",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addIndustryCase').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteIndustryCase").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteIndustryCaseById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editIndustryCase").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getIndustryCaseById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_hrefUrl").val(obj2.hrefurl);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteIndustryCase').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editIndustryCase").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        formdata.append("hrefUrl", $("#edit_hrefUrl").val());
        formdata.append("order", $("#edit_order").val());
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editIndustryCase",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editIndustryCase').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------行业案例使用的函数----------------END---------------------

    //-------------------------行业案例使用的函数----------------START---------------------
//添加
    $("#addCooperativeUser").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        formdata.append("order", $("#order").val())
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addCooperativeUser",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addCooperativeUser').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteCooperativeUser").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteCooperativeUserById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editCooperativeUser").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getCooperativeUserById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteCooperativeUser').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editCooperativeUser").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        formdata.append("order", $("#edit_order").val());
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editCooperativeUser",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editCooperativeUser').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------行业案例使用的函数----------------END---------------------

    //-------------------------关于我们使用的函数----------------START---------------------
//添加
    $("#addAboutUS").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        var content = filterXSS(editor.txt.html())  // 此处进行 xss 攻击过滤
        formdata.append("content", content);
        formdata.append("introduction", $("#introduction").val());
        formdata.append("honor", $("#honor").val());
        formdata.append("culture", $("#culture").val());
        formdata.append("course", $("#course").val());
        formdata.append("order", $("#order").val());
        $.ajax({
            url: "addAboutUS",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addAboutUS').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteAboutUS").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteAboutUSById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editAboutUS").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getAboutUSById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            editor_edit.txt.html(obj2.content);
            // $("#edit_content").html(obj2.content);
            $("#edit_introduction").val(obj2.introduction);
            $("#edit_honor").val(obj2.honor);
            $("#edit_culture").val(obj2.culture);
            $("#edit_course").val(obj2.course);
            $("#edit_order").val(obj2.order);
        });
    })
    $('.deleteCooperativeUser').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editAboutUS").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        var content = filterXSS(editor_edit.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("content", content);
        formdata.append("introduction", $("#edit_introduction").val());
        formdata.append("honor", $("#edit_honor").val());
        formdata.append("culture", $("#edit_culture").val());
        formdata.append("course", $("#edit_course").val());
        formdata.append("order", $("#edit_order").val());
        $.ajax({
            url: "editAboutUS",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editAboutUS').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------关于我们使用的函数----------------END---------------------

    //-------------------------庚顿信息使用的函数----------------START---------------------
//添加
    $("#addGoldenInfo").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        var content = filterXSS(editor.txt.html())  // 此处进行 xss 攻击过滤
        formdata.append("content", content);
        formdata.append("module", $("#module").val());
        formdata.append("menu", $("#menu").val());
        $.ajax({
            url: "addGoldenInfo",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addGoldenInfo').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteGoldenInfo").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteGoldenInfoById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editGoldenInfo").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getGoldenInfoById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            editor_edit.txt.html(obj2.content);
            $("#edit_module").val(obj2.module);
            $("#edit_menu").val(obj2.menu);
        });
    })
    $('.deleteGoldenInfo').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editGoldenInfo").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        var content = filterXSS(editor_edit.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("content", content);
        formdata.append("module", $("#edit_module").val());
        formdata.append("menu", $("#edit_menu").val());
        $.ajax({
            url: "editGoldenInfo",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editGoldenInfo').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------庚顿信息使用的函数----------------END---------------------
    //-------------------------字典管理的函数----------------START---------------------
//添加
    $("#addEnum").on('click', function () {
        var formdata = new FormData();
        formdata.append("enumkey", $("#enumkey").val());
        formdata.append("enumvalue", $("#enumvalue").val());
        formdata.append("type", $("#type").val());
        $.ajax({
            url: "addEnum",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addEnum').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteEnum").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteEnumById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editEnum").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getEnumById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_enumkey").val(obj2.enumkey);
            $("#edit_enumvalue").val(obj2.enumvalue);
            $("#edit_type").val(obj2.type);
        });
    })
    $('.deleteEnum').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editEnum").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("enumkey", $("#edit_enumkey").val());
        formdata.append("enumvalue", $("#edit_enumvalue").val());
        formdata.append("type", $("#edit_type").val());
        $.ajax({
            url: "editEnum",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editEnum').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------字典管理使用的函数----------------END---------------------


    //-------------------------用户管理的函数----------------START---------------------
    //删除
    $(".deleteUser").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteUserById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
    //修改
    $(".editUser").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getUserById", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#edit_id").val(obj2.id);
            $("#edit_loginusername").val(obj2.loginusername);
            $("#edit_name").val(obj2.name);
            $("#edit_sex").val(obj2.sex);
            $("#edit_state").val(obj2.state);
            $("#edit_role").val(obj2.role);
            $("#edit_registertime").val(obj2.registertime);
        });
    })
    $('.deleteUser').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editUser").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("loginusername", $("#edit_loginusername").val());
        formdata.append("name", $("#edit_name").val());
        formdata.append("sex", $("#edit_sex").val());
        formdata.append("state", $("#edit_state").val());
        formdata.append("role", $("#edit_role").val());
        formdata.append("registertime", $("#edit_registertime").val());
        $.ajax({
            url: "editUser",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editUser').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //-------------------------用户管理使用的函数----------------END---------------------
//---------------------------------产品购买--产品管理-----------START----------------------------------------------

    //添加
    $("#addProductInfo").on('click', function () {
        var formdata = new FormData();
        formdata.append("title", $("#title").val());
        formdata.append("content", $("#content").val());
        formdata.append("order", $("#order").val())
        var param = filterXSS(parameter.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("parameter", param);
        var pr = filterXSS(price.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("price",pr);
        var de = filterXSS(details.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("details", de);
        var no = filterXSS(notice.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("notice", no);
        var image = document.getElementById("inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "addProductInfo",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_addHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })

    //修改
    $(".editProductInfo").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/getProductBuyInfoById", obj, function (data, status) {
            var obj2 = eval(data);
            $("#edit_id").val(obj2.id);
            $("#edit_title").val(obj2.title);
            $("#edit_content").val(obj2.content);
            $("#edit_order").val(obj2.order);
            edit_parameter.txt.html(obj2.parameter);
            edit_price.txt.html(obj2.price);
            edit_details.txt.html(obj2.details);
            edit_notice.txt.html(obj2.notice);
        });
    })
    $('.deleteProductInfo').popover(
        {
            trigger: 'hover', //触发方式
            title: "提示",//设置 弹出框 的标题
            html: true, // 为true的话，data-content里就能放html代码了
            content: "确定要删除该信息?"//这里可以直接写字符串，也可以 是一个函数，该函数返回一个字符串；
        }
    );
    //修改提交
    $("#editProductInfo").on('click', function () {
        var formdata = new FormData();
        formdata.append("id", $("#edit_id").val());
        formdata.append("title", $("#edit_title").val());
        formdata.append("content", $("#edit_content").val());
        formdata.append("order", $("#edit_order").val());
        var param = filterXSS(edit_parameter.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("parameter", param);
        var pr = filterXSS(edit_price.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("price",pr);
        var de = filterXSS(edit_details.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("details", de);
        var no = filterXSS(edit_notice.txt.html());  // 此处进行 xss 攻击过滤
        formdata.append("notice", no);
        var image = document.getElementById("edit_inputfile");
        formdata.append("imgFile", image.files[0]);
        $.ajax({
            url: "editProductInfo",
            type: "POST",
            data: formdata,
            processData: false,
            contentType: false,
            success: function (data) {
                var obj2 = JSON.parse(data);
                $('#myModal_editHomeProduct').modal("hide");
                $("#myModal_tips .modal-body").html(obj2.msg);
                $("#tips").click();
            }
        });
    })
    //删除
    $(".deleteProductInfo").on('click', function () {
        var td = $(this).parent().parent().children();
        var id = td[0].innerHTML;
        var obj = new Object();
        obj.id = id;
        $.post("/deleteProductInfo", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $("#myModal_tips .modal-body").html(obj2.msg);
            $("#tips").click();
        });
    })
//---------------------------------产品购买--产品管理------------END---------------------------------------------
    $("#addLunbotuForm").validate();

})
