import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:spotify_app/common/widget/button/basic_app_button.dart';
import 'package:spotify_app/core/config/asset/app_vector.dart';
import 'package:spotify_app/core/config/theme/app_color.dart';
import 'package:spotify_app/presentation/choose_mode/page/choose_mode.dart';

import '../../../core/config/asset/app_image.dart';

class GetStartedPage extends StatelessWidget {
  const GetStartedPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Stack(
      children: [
        Container(
          padding: const EdgeInsets.symmetric(vertical: 40, horizontal: 40),
          decoration: const BoxDecoration(
              image: DecorationImage(
                  image: AssetImage(AppImage.introBg), fit: BoxFit.fill)),
        ),
        Container(
          color: Colors.black.withOpacity(0.15),
        ),
        Padding(
          padding: const EdgeInsets.all(40.0),
          child: Column(
            children: [
              Align(
                alignment: Alignment.topCenter,
                child: SvgPicture.asset(AppVector.logo),
              ),
              const Spacer(),
              const Text(
                'Enjoy listening to music',
                style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.white,
                    fontSize: 18),
              ),
              const SizedBox(height: 25),
              const Text(
                textAlign: TextAlign.center,
                'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sagittis enim purus sed phasellus. Cursus ornare id scelerisque aliquam.',
                style: TextStyle(
                    fontWeight: FontWeight.w500,
                    color: AppColor.grey,
                    fontSize: 13),
              ),
              const SizedBox(height: 25),
              BasicAppButton(
                  onPressed: () {
                    Navigator.push(
                        context,
                        MaterialPageRoute(
                          builder: (context) => const ChooseModePage(),
                        ));
                  },
                  title: 'Get started')
            ],
          ),
        ),
      ],
    ));
  }
}
