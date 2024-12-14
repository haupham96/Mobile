import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:spotify_app/core/config/asset/app_image.dart';

import '../../../common/widget/button/basic_app_button.dart';
import '../../../core/config/asset/app_vector.dart';
import '../../../core/config/theme/app_color.dart';

class ChooseModePage extends StatelessWidget {
  const ChooseModePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Stack(
      children: [
        Container(
          padding: const EdgeInsets.symmetric(vertical: 40, horizontal: 40),
          decoration: const BoxDecoration(
              image: DecorationImage(
                  image: AssetImage(AppImage.chooseMode), fit: BoxFit.fill)),
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
                'Choose Mode',
                style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: AppColor.greyWhite,
                    fontSize: 18),
              ),
              const SizedBox(height: 40),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Column(
                    children: [
                      ClipOval(
                        child: BackdropFilter(
                          filter: ImageFilter.blur(sigmaX: 10, sigmaY: 10),
                          child: Container(
                            width: 80,
                            height: 80,
                            decoration: BoxDecoration(
                              color: const Color(0xff30393C).withOpacity(0.5),
                              shape: BoxShape.circle,
                            ),
                            child: SvgPicture.asset(
                              AppVector.darkMode,
                              width: 36,
                              height: 36,
                              fit: BoxFit.none,
                            ),
                          ),
                        ),
                      ),
                      const SizedBox(height: 5),
                      const Text(
                        'Dark Mode',
                        style: TextStyle(color: AppColor.greyWhite, fontSize: 17),
                      )
                    ],
                  ),
                  const SizedBox(width: 40),
                  Column(
                    children: [
                      ClipOval(
                        child: BackdropFilter(
                          filter: ImageFilter.blur(sigmaX: 10, sigmaY: 10),
                          child: Container(
                            width: 80,
                            height: 80,
                            decoration: BoxDecoration(
                                color: Color(0xff30393C).withOpacity(0.5),
                                shape: BoxShape.circle),
                            child: SvgPicture.asset(
                              AppVector.lightMode,
                              width: 36,
                              height: 36,
                              fit: BoxFit.none,
                            ),
                          ),
                        ),
                      ),
                      const SizedBox(height: 5),
                      const Text(
                        'Light Mde',
                        style: TextStyle(color: AppColor.greyWhite, fontSize: 17),
                      )
                    ],
                  ),
                ],
              ),
              const SizedBox(height: 40),
              BasicAppButton(
                  onPressed: () {
                    Navigator.push(
                        context,
                        MaterialPageRoute(
                          builder: (context) => const ChooseModePage(),
                        ));
                  },
                  title: 'Continue')
            ],
          ),
        ),
      ],
    ));
  }
}
