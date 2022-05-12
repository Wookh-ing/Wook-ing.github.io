$(function(){
    ///////////////////////////////////////////

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay:true,
        pauseOnHover:false,
        pauseOnFocus: false,
        autoplaySpeed : 2000,
    });

    $('.main_slider').on('init reInit afterChange', function(){
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on')
    });
    


    //////////////////////////////////////////










});