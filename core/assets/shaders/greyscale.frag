#version 300
precision mediump float;
uniform sampler2D u_texture;

varying vec4 vColor;
varying vec2 vTexCoord;

out vec4 FragColor;

void main(){
    vec4 texColor = texture2D(u_texture, vTexCoord);
    
    // Greyscale - why does this work?
    float gray = dot(texColor.rgb, vec3(0.299, 0.587, 0.144));

    vec4 finalColor = texColor * gray;

   FragColor = finalColor;
}
