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
})
