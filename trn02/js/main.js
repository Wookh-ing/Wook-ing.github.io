$(function(){
    ///////////////////////////////////////////

    $('.top_banner i').on('click', function(){
        $('.top_banner').slideUp(1000);
    });

    $('.main_slider').on('init reInit afterChange', function(){
        console.log('변했네???');
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    })

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });

    $('.movie .dec i:nth-of-type(1)').on('click', function(){
        $('.movie video').trigger('play')
    })

    $('.movie .dec i:nth-of-type(2)').on('click', function(){
        $('.movie video').trigger('pause')
    })

    $('#myMovie').YTPlayer ({
                    videoURL:'https://www.youtube.com/watch?v=OANMHhMdUqs', 
                    containment:'.utube',
                    autoPlay:true, 
                    mute:true, 
                    startAt:0,
                    opacity:1,
                    showControls: false,
                    playOnlyIfVisible: true,    
                });

    $('.utube i:nth-of-type(1)').on('click', function(){
        $('#myMovie').YTPPlay();
    });
    
    $('.utube i:nth-of-type(2)').on('click', function(){
        $('#myMovie').YTPPause();
    });

        $('.sub_slide').slick({
            infinite: true,
            slidesToShow: 5,
            slideToScroll: 1,
            arrows: false,
            dots: true,
            autoplay: true,

        });

    $('.sub_slider i.xi-arrow-left').on('click',function(){
        $('.sub_slide').slick('slickPrev')
    });
    $('.sub_slider i.xi-arrow-right').on('click',function(){
        $('.sub_slide').slick('slickNext')
    })


    


    //////////////////////////////////////////
});