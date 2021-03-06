# This script tests the planetarium, 360 and stereo mode commands
# Created by Toni Sagrista

from py4j.java_gateway import JavaGateway, GatewayParameters

gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_convert=True))
gs = gateway.entry_point

gs.setCameraFocus("Sol")
gs.sleep(3)

gs.setCinematicCamera(True)
gs.setRotationCameraSpeed(20.0)
gs.cameraRotate(1.0, 0.0)

gs.print("Bloom")
gs.setBloom(100.0)
gs.sleep(4)
gs.setBloom(50.0)
gs.sleep(4)
gs.setBloom(10.0)
gs.sleep(4)
gs.setBloom(0.0)

gs.print("Star glow")
gs.setStarGlow(False)
gs.sleep(4)
gs.setStarGlow(True)
gs.sleep(4)


gs.print("Motion blur")
gs.setMotionBlur(True)
gs.sleep(4)
gs.setMotionBlur(False)
gs.sleep(4)


gs.print("Lens flare")
gs.setLensFlare(True)
gs.sleep(4)
gs.setLensFlare(False)
gs.sleep(4)
gs.setLensFlare(True)

gs.setCinematicCamera(False)

gateway.close()